package com.higgsup.service.impl;

import com.higgsup.model.Student;
import com.higgsup.repository.StudentRepository;
import com.higgsup.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl() {
        System.out.println("Default Service Auto wired!");
    }

    public StudentServiceImpl(StudentRepository studentRepository) {
        System.out.println("Constructor injection");
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent(){
        return studentRepository.getAllStudent();
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        System.out.println("Setter injection...");
        this.studentRepository = studentRepository;
    }
}
