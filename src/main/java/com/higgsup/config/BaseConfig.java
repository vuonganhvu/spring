package com.higgsup.config;

import com.higgsup.DemoApp;
import com.higgsup.event.CStartEventHandler;
import com.higgsup.repository.StudentRepository;
import com.higgsup.repository.impl.StudentRepositoryImpl;
import com.higgsup.service.StudentService;
import com.higgsup.service.impl.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public StudentServiceImpl studentService(StudentRepository studentRepository){
        return new StudentServiceImpl(studentRepository);
    }

    @Bean
    public StudentRepository studentRepository(){
        return new StudentRepositoryImpl();
    }

    @Bean
    public CStartEventHandler cStartEventHandler(){
        return new CStartEventHandler();
    }
}
