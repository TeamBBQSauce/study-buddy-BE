package com.StudyBuddy.Domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="PERSON")
public class Person implements Serializable {

    @Id
    @Column(name="PERSON_ID")
    @GeneratedValue
    private Long Id;

    @Column(name="PERSON_NAME")
    private String name;

    @OneToMany(mappedBy="person")
    private List<Feedback> feedback;

    protected Person(){}
}
