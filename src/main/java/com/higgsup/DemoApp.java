package com.higgsup;

import com.higgsup.config.ApplicationConfig;
import com.higgsup.model.Student;
import com.higgsup.service.StudentService;
import com.higgsup.service.impl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class DemoApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        StudentService studentService = context.getBean(StudentService.class);
        List<Student> studentList = studentService.getAllStudent();
        System.out.println(studentList.size());
        Student student = studentList.get(0);
        System.out.println(student);
    }
}
