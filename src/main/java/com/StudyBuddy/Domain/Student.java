package com.StudyBuddy.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Student implements Serializable{

    @Id
    @GeneratedValue //is this the wisest thing to do with postgres?
    private Integer id;

    @Column
    private String name;

    @Column
    private String degreeCode;

    @Column
    private Integer studentId;

    public Student(java.lang.String name, java.lang.String degreeCode, java.lang.Integer studentId) {
        this.name = name;
        this.degreeCode = degreeCode;
        this.studentId = studentId;
    }

    protected Student(){}

    public Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public String getDegreeCode() {
        return degreeCode;
    }

    public void setDegreeCode(String degreeCode) {
        this.degreeCode = degreeCode;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(java.lang.Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student string = (Student) o;

        if (id != null ? !id.equals(string.id) : string.id != null) return false;
        if (name != null ? !name.equals(string.name) : string.name != null) return false;
        if (degreeCode != null ? !degreeCode.equals(string.degreeCode) : string.degreeCode != null) return false;
        return studentId != null ? studentId.equals(string.studentId) : string.studentId == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (degreeCode != null ? degreeCode.hashCode() : 0);
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        return result;
    }
}
