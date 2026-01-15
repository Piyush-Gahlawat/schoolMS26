package com.shiryu.schoolmanagementsystem;

import java.util.Objects;

public class Department {
    private Integer id;
    private String name;
    private String descString;
    private String courseStack;
    public Department() {
    }

    public Department(Integer id, String name, String descString, String courseStack) {
        this.id = id;
        this.name = name;
        this.descString = descString;
        this.courseStack = courseStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(descString, that.descString) && Objects.equals(courseStack, that.courseStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, descString, courseStack);
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

    public String getDescString() {
        return descString;
    }

    public void setDescString(String descString) {
        this.descString = descString;
    }

    public String getCourseStack() {
        return courseStack;
    }

    public void setCourseStack(String courseStack) {
        this.courseStack = courseStack;
    }
}
