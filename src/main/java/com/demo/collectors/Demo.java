package com.demo.collectors;

public class Demo {

    public String dept;
    public String name;
    public String empId;

    public Demo(String dept, String name, String empId) {
        this.dept = dept;
        this.name = name;
        this.empId = empId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Demo [dept=" + dept + ", name=" + name + ", empId=" + empId + "]";
    }

}
