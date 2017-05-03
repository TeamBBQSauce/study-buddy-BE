package com.StudyBuddy.repo;

import com.StudyBuddy.Domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    Student findByStudentId(@Param("studentId") java.lang.Integer studentId);
}
