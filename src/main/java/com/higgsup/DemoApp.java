package com.higgsup;

import com.higgsup.repository.StudentRepository;
import com.higgsup.service.LocationService;
import com.higgsup.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        LocationService locationService = context.getBean("locationService", LocationService.class);
        StudentRepository studentRepository = context.getBean("studentRepository", StudentRepository.class);
        System.out.println(studentService.getAllStudent().size());

    }
}
