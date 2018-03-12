package com.higgsup.repository.impl;

import com.higgsup.model.Student;
import com.higgsup.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository{

    public StudentRepositoryImpl() {
        System.out.println("Default Repository Auto wired!");
    }

    @Override
    public List<Student> getAllStudent(){
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Anhvv", "Ha Noi"));
        studentList.add(new Student("Hungnh", "Thai Binh"));
        return studentList;
    }
}
