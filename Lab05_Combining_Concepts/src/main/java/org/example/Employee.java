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
    public String classifySalary() {

        if (salary < 10000) {
            return "Must be nelow R10,000";
        } else if (salary < 20000) {
            return " Must be R10,000 to below R20,000";
        } else {
            return "Must be R20,000 and above";
        }
    }

    public void displayDetails() {
        IO.println("Employee Number: " + employeeNo);
        IO.println("Name: " + name);
        IO.println("Monthly Salary: R" + salary);
        IO.println("Salary Categories: " + classifySalary());
        IO.println("============================");
    }
}