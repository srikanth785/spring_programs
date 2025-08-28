package com.cat.service;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cat.model.Student;
import com.cat.model.User;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Service;


@Service
public class ReportService 
{
//    public byte[] generateUserReport(List<User> users) throws JRException {
//        // Load .jrxml from classpath
//        InputStream reportStream = getClass().getResourceAsStream("/report/myreport.jrxml");
//        JasperReport jasperReport = JasperCompileManager.compileReport(reportStream);
//
//        // Prepare data
//        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(users);
//        Map<String, Object> params = new HashMap<>();
//        params.put("createdBy", "Spring Boot + JasperReports");
//
//        // Fill the report
//        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dataSource);
//
//        // Export to PDF
//        return JasperExportManager.exportReportToPdf(jasperPrint);
//    }
    public byte[] generateUserReport(List<Student> stu) throws JRException {
        // Load .jrxml from classpath
        InputStream reportStream = getClass().getResourceAsStream("/report/studentreport.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(reportStream);

        // Prepare data
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(stu);
        Map<String, Object> params = new HashMap<>();
        params.put("createdBy", "Spring Boot + JasperReports");

        // Fill the report
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dataSource);

        // Export to PDF
        return JasperExportManager.exportReportToPdf(jasperPrint);
    }

}
