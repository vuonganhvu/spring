package com.higgsup.service.impl;

import com.higgsup.model.Student;
import com.higgsup.repository.StudentRepository;
import com.higgsup.service.LocationService;
import com.higgsup.service.StudentService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.List;

//@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private LocationService locationService;

    public StudentServiceImpl() {
        System.out.println("Constructor student service");
    }


    public StudentServiceImpl(StudentRepository studentRepository, LocationService locationService) {
        System.out.println("Constructor student service injection");
        this.studentRepository = studentRepository;
        this.locationService = locationService;
    }

    @Override
    public List<Student> getAllStudent(){
        return studentRepository.getAllStudent();
    }

//    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        System.out.println("Setter student repository");
        this.studentRepository = studentRepository;
    }

//    @Autowired
    public void setLocationService(LocationService locationService) {
        System.out.println("Setter student service");
        this.locationService = locationService;
    }

    public void init(){
        System.out.println("Init studentService...");
    }


    public void destroy(){
        System.out.println("Destroy studentService...");
    }

}
