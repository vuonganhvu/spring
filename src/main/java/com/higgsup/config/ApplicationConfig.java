package com.higgsup.config;

import com.higgsup.repository.StudentRepository;
import com.higgsup.repository.impl.StudentRepositoryImpl;
import com.higgsup.service.StudentService;
import com.higgsup.service.impl.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean("studentService")
    public StudentService getStudentService(StudentRepository studentRepository){
        return new StudentServiceImpl(studentRepository);
    }

    @Bean("studentRepository")
    public StudentRepository getStudentRepository(){
        return new StudentRepositoryImpl();
    }
}
