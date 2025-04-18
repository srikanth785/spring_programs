package com.cat.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

import com.cat.entity.Health;
import com.cat.repo.HealthRepository;

@Configuration
@EnableBatchProcessing
public class SpringBatchConfig {

    private final HealthRepository healthRepository;

    public SpringBatchConfig(HealthRepository healthRepository) {
        this.healthRepository = healthRepository;
    }

    @Bean
    public FlatFileItemReader<Health> healthReader() {
        FlatFileItemReader<Health> itemReader = new FlatFileItemReader<>();
        itemReader.setResource(new FileSystemResource("src/main/resources/data.csv")); // Uses classpath
        itemReader.setName("csv-reader");
        itemReader.setLinesToSkip(1);
        itemReader.setLineMapper(lineMapper());
        return itemReader;
    }

    public LineMapper<Health> lineMapper() {
        DefaultLineMapper<Health> lineMapper = new DefaultLineMapper<>();

        DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
        tokenizer.setDelimiter(",");
        tokenizer.setStrict(false);
        tokenizer.setNames("id", "duration", "pulse", "maxPulse", "calories");

        BeanWrapperFieldSetMapper<Health> mapper = new BeanWrapperFieldSetMapper<>();
        mapper.setTargetType(Health.class);

        lineMapper.setLineTokenizer(tokenizer);
        lineMapper.setFieldSetMapper(mapper);
        return lineMapper;
    }

    @Bean
    public HealthProcessor healthProcessor() {
        return new HealthProcessor();
    }

    @Bean
    public RepositoryItemWriter<Health> writer() {
        RepositoryItemWriter<Health> writer = new RepositoryItemWriter<>();
        writer.setRepository(healthRepository);
        writer.setMethodName("save");
        return writer;
    }

    @Bean
    public Step myStep(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        
    	return new StepBuilder("myStep", jobRepository)
                .<Health, Health>chunk(10, transactionManager)
                .reader(healthReader())
                .processor(healthProcessor())
                .writer(writer())
                .build();
    }

    @Bean
    public Job job(JobRepository jobRepository, Step myStep) {
    	
        return new JobBuilder("health-import-job", jobRepository)
                .start(myStep)
                .build();
    }
}
