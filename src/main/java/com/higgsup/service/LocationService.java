package com.higgsup.service;

import com.higgsup.model.Student;

import java.util.List;

public interface LocationService {
    List<Student> getStudentsByLocation(String location);
}
