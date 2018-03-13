package com.higgsup.service.impl;

import com.higgsup.service.LocationService;
import com.higgsup.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service("locationService")
public class LocationServiceImpl implements LocationService {

//    private StudentService studentService;

    public LocationServiceImpl() {
        System.out.println("Constructor location service");
    }

//    public LocationServiceImpl(StudentService studentService) {
//        System.out.println("Constructor location service injection");
//        this.studentService = studentService;
//    }


//    public void setStudentService(StudentService studentService) {
//        System.out.println("setter location service");
//        this.studentService = studentService;
//    }
}
