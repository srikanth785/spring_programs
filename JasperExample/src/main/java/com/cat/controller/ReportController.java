package com.cat.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cat.model.Student;
import com.cat.model.User;
import com.cat.service.ReportService;
import com.cat.service.StudentService;

@RestController
@RequestMapping("/api/reports")
public class ReportController 
{
    @Autowired
    private ReportService reportService;
    
    @Autowired
    private StudentService ss;
    
    @GetMapping("/students")
    public ResponseEntity<byte[]> generateUserReport() throws Exception {
//        List<User> users = Arrays.asList(
//            new User("Alice", "alice@example.com"),
//            new User("Bob", "bob@example.com")
//        );
//
//        byte[] pdf = reportService.generateUserReport(users);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_PDF);
//        headers.setContentDisposition(ContentDisposition.inline().filename("myreport.pdf").build());
//
//        return new ResponseEntity<>(pdf, headers, HttpStatus.OK);
    	List<Student> stu = ss.getAllStudents();

            byte[] pdf = reportService.generateUserReport(stu);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDisposition(ContentDisposition.inline().filename("studentreport.pdf").build());

            return new ResponseEntity<>(pdf, headers, HttpStatus.OK);
    }


}
