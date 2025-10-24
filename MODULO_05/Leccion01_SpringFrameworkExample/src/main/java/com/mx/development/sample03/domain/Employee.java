package com.mx.development.sample03.domain;

public class Employee {
    private String name;
    private String employeeID;
    private String department;
    private Address address;

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Department: " + getDepartment());
        System.out.println("Address: " + getAddress().toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
