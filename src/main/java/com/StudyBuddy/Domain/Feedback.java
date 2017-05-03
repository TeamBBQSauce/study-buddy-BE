package com.StudyBuddy.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Feedback implements Serializable{

    @Id
    @GeneratedValue //is this the wisest thing to do with postgres?
    private Integer id;

    @Column
    private String personalFeedback;

    @Column
    private Integer studentId;

    @Column
    private Integer grade;

    @Column
    private String moduleCode;

    @Column
    private String assignmentCode;

    @Column
    private String assignmentType;

    public Feedback(String personalFeedback, Integer studentId, Integer grade, java.lang.String moduleCode, java.lang.String assignmentCode, java.lang.String assignmentType) {
        this.personalFeedback = personalFeedback;
        this.studentId = studentId;
        this.grade = grade;
        this.moduleCode = moduleCode;
        this.assignmentCode = assignmentCode;
        this.assignmentType = assignmentType;
    }


    protected Feedback(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public java.lang.String getPersonalFeedback() {
        return personalFeedback;
    }

    public void setPersonalFeedback(java.lang.String personalFeedback) {
        this.personalFeedback = personalFeedback;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public java.lang.String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(java.lang.String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public java.lang.String getAssignmentCode() {
        return assignmentCode;
    }

    public void setAssignmentCode(java.lang.String assignmentCode) {
        this.assignmentCode = assignmentCode;
    }

    public java.lang.String getAssignmentType() {
        return assignmentType;
    }

    public void setAssignmentType(java.lang.String assignmentType) {
        this.assignmentType = assignmentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feedback)) return false;

        Feedback feedback = (Feedback) o;

        if (id != null ? !id.equals(feedback.id) : feedback.id != null) return false;
        if (personalFeedback != null ? !personalFeedback.equals(feedback.personalFeedback) : feedback.personalFeedback != null)
            return false;
        if (studentId != null ? !studentId.equals(feedback.studentId) : feedback.studentId != null) return false;
        if (grade != null ? !grade.equals(feedback.grade) : feedback.grade != null) return false;
        if (moduleCode != null ? !moduleCode.equals(feedback.moduleCode) : feedback.moduleCode != null) return false;
        if (assignmentCode != null ? !assignmentCode.equals(feedback.assignmentCode) : feedback.assignmentCode != null)
            return false;
        return assignmentType != null ? assignmentType.equals(feedback.assignmentType) : feedback.assignmentType == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (personalFeedback != null ? personalFeedback.hashCode() : 0);
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + (moduleCode != null ? moduleCode.hashCode() : 0);
        result = 31 * result + (assignmentCode != null ? assignmentCode.hashCode() : 0);
        result = 31 * result + (assignmentType != null ? assignmentType.hashCode() : 0);
        return result;
    }
}
