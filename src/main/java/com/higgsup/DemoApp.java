package com.higgsup;

import com.higgsup.model.Student;
import com.higgsup.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DemoApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        List<Student> studentList = studentService.getAllStudent("Anhvv");
        System.out.println(studentList.size());

    }
}
