package com.StudyBuddy.service;

import com.StudyBuddy.Domain.Feedback;
import com.StudyBuddy.Domain.Student;
import com.StudyBuddy.repo.FeedbackRepository;
import com.StudyBuddy.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    FeedbackRepository feedbackRepository;
    StudentRepository studentRepository;

    @Autowired
    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public Feedback generateFeedback(String personalFeedback, Integer studentId, Integer grade, String moduleCode, String assignmentCode, String assignmentType) {
//        Student string = studentRepository.findByStudentId(studentId);
//        System.out.println(string.getName());
//        if (string == null) {
//            throw new RuntimeException("Student does not exist");
//        }
        return feedbackRepository.save(new Feedback(personalFeedback,studentId, grade,
                moduleCode, assignmentCode, assignmentType));
    }

    public Iterable<Feedback> lookup(){
        return feedbackRepository.findAll();
    }

    public long total(){
        return feedbackRepository.count();
    }
}
