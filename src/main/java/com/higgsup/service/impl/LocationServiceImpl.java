package com.higgsup.service.impl;

import com.higgsup.model.Student;
import com.higgsup.repository.StudentRepository;
import com.higgsup.service.LocationService;

import java.util.ArrayList;
import java.util.List;

public class LocationServiceImpl implements LocationService {

    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudentsByLocation(String location) {
        return new ArrayList<>();
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
