package com.app.model;

import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
public class Student {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sId;

    @Column(length = 50)
    private String sName;
    private int marks;

    public Student() {
        // System.out.println("Student object created");
    }

    public int getSId() {
        return  sId;
    }
    public void setSId(int sId) {
        this.sId = sId;
    }
    public String getSName() {
        return  sName;
    }
    public void setSName(String sName) {
        this.sName = sName;
    }
    public int getMarks() {
        return  marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + getSId() +
                ", sName='" + getSName() + '\'' +
                ", marks=" + getMarks() +
                '}';
    }
}
