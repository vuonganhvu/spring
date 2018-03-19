package com.higgsup.service.impl;

import com.higgsup.model.Student;
import com.higgsup.repository.StudentRepository;
import com.higgsup.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent(){
        return studentRepository.getAllStudent();
    }

    private void init(){
        System.out.println("init StudentService Impl");
    }

    private void cleanup(){
        System.out.println("cleanup StudentService Impl");
    }
}
