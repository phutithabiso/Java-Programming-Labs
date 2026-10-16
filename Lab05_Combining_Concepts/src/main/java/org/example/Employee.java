package org.example;

public class Employee {

    private int employeeNo;
    private String name;
    private double salary;

    public Employee(int employeeNo,String name, double salary) {
        this.employeeNo = employeeNo;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


}
