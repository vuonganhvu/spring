package com.higgsup.config;

import com.higgsup.DemoApp;
import com.higgsup.repository.StudentRepository;
import com.higgsup.repository.impl.StudentRepositoryImpl;
import com.higgsup.service.StudentService;
import com.higgsup.service.impl.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BaseConfig.class)
public class ApplicationConfig {

}
