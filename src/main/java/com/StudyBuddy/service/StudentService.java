package com.StudyBuddy.service;

import com.StudyBuddy.Domain.Student;
import com.StudyBuddy.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(java.lang.String name, java.lang.String degreeCode, java.lang.Integer studentNo) {
        return studentRepository.save(new Student(name, degreeCode, studentNo));
    }

    public Iterable<Student> lookup(){
        return studentRepository.findAll();
    }

    public long total(){
        return studentRepository.count();
    }
}
