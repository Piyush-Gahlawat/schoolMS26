package com.shiryu.schoolmanagementsystem;

import java.util.Objects;

public class Teacher {
    private Integer id;
    private String name;
    private Integer deptId;
    private String classStack;

    public Teacher() {
    }

    public Teacher(Integer id, String name, Integer deptId, String classStack) {
        this.id = id;
        this.name = name;
        this.deptId = deptId;
        this.classStack = classStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id) && Objects.equals(name, teacher.name) && Objects.equals(deptId, teacher.deptId) && Objects.equals(classStack, teacher.classStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, deptId, classStack);
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

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getClassStack() {
        return classStack;
    }

    public void setClassStack(String classStack) {
        this.classStack = classStack;
    }
}
