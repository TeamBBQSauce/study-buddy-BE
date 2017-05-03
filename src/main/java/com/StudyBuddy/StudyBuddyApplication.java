package com.StudyBuddy;

import com.StudyBuddy.service.FeedbackService;
import com.StudyBuddy.service.StudentService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

import static com.StudyBuddy.StudyBuddyApplication.FeedbackFromFile.importFeedback;
import static com.StudyBuddy.StudyBuddyApplication.StudentFromFile.importStudents;

@SpringBootApplication
public class StudyBuddyApplication implements CommandLineRunner {
	@Autowired
	private StudentService studentService;

	@Autowired
	private FeedbackService feedbackService;


	public static void main(String[] args) {

		SpringApplication.run(StudyBuddyApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		importStudents().forEach(student -> studentService.createStudent(student.name, student.degree, student.studentNo));
		System.out.println(studentService.total());

		importFeedback().forEach(
				feedback -> feedbackService.generateFeedback(
				feedback.feedbackPersonal,feedback.studentNo,feedback.grade,
				feedback.moduleCode,feedback.assignmentCode,feedback.assignmentType
		));
		System.out.println(feedbackService.total());
	}

	static class FeedbackFromFile{
		String moduleCode, assignmentCode, assignmentType, feedbackPersonal;
		Integer grade, studentNo;

		static List<FeedbackFromFile> importFeedback() throws IOException {
			return new ObjectMapper().setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
					.readValue(
							FeedbackFromFile.class.getResourceAsStream("/Feedback.json"),
							new TypeReference<List<FeedbackFromFile>>() {});
		}
	}

	static class StudentFromFile{
		String name, degree;
		Integer studentNo;

		static List<StudentFromFile> importStudents() throws IOException {
			return new ObjectMapper().setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
					.readValue(
							StudentFromFile.class.getResourceAsStream("/Students.json")
							,new TypeReference<List<StudentFromFile>>(){});

		}

	}
}
