package com.shiryu.schoolmanagementsystem;

import java.util.Objects;

public class Student {
    private Integer id;
    private String name;
    private String grade;
    private String courseStack;

    public Student() {
    }

    public Student(Integer id, String name, String grade, String courseStack) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.courseStack = courseStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(grade, student.grade) && Objects.equals(courseStack, student.courseStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, grade, courseStack);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCourseStack() {
        return courseStack;
    }

    public void setCourseStack(String courseStack) {
        this.courseStack = courseStack;
    }
}
