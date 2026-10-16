package org.example;

public class Employee {

    private String employeeNo;
    private String name;
    private double salary;

    public Employee(String employeeNo,String name, double salary) {
        this.employeeNo = employeeNo;
        this.name = name;
        this.salary = salary;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}
