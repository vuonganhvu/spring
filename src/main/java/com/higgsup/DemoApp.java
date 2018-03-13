package com.higgsup;

import com.higgsup.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        System.out.println(studentService.getAllStudent().size());
        context.registerShutdownHook();
    }
}
