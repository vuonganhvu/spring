package com.higgsup;

import com.higgsup.collection.School;
import com.higgsup.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        School school = context.getBean(School.class);
        System.out.println(school);

    }
}
