package org.example;

public class Display {

    void runStudent() {

        Student s1 = new Student("St10219717", "Moe", new int[]{70, 80, 60});
        Student s2 = new Student("St10219034", "Lethabo", new int[]{170, 190, 150});
        Student s3 = new Student("St10219002", "neo", new int[]{12, 29, 36});
        Student[] students = {s1, s2, s3};

// highet student
        int passed = 0;
        Student highest = students[0];

        for (int i = 0; i < students.length; i++) {
            students[i].desplayDetails();
            if (students[i].hasPassed()) {
                passed++;
            }
            if (students[i].calculateAverage() > highest.calculateAverage()) {
                highest = students[i];
            }
            IO.println("--------------------");
        }
        IO.println("============About Student==============");
        IO.println("Total students: " + students.length);
        IO.println("Students passed: " + passed);
        IO.println("Students failed: " + (students.length - passed));
        IO.println("============Highest Average==============");
        IO.println("Highest average student: " + highest.getName());
        IO.println("Highest average: " + highest.calculateAverage());
        IO.println("***************************************");
    }

    void runProduct() {

        Product[] pdc = {
                new Product("Laptop", 18000, 1),
                new Product("Mouse", 250, 2),
                new Product("Keyboard", 450, 2),
                new Product("Headphones", 600, 1)
        };

        displayMenu(pdc);
    }
// here we are displaying the  menu for product
    static void displayMenu(Product[] products) {

        IO.println("========== Product info ==========");
        for (int k = 0; k < products.length; k++) {
            double lineTotal = products[k].calculateLineTotal();

            IO.println("Product: " + products[k].getName());
            IO.println("Price: R" + products[k].getPrice());
            IO.println("Quantity: " + products[k].getQuantity());
            IO.println("Line total: R" + lineTotal);
            IO.println("=========================");
        }

        double subtotal = calculateSubtotal(products);
        double discount = calculateDiscount(subtotal);
        double finalTotal = subtotal - discount;

        displayTotals(subtotal, discount, finalTotal);
    }

    static double calculateSubtotal(Product[] products) {

        double subtotal = 0;

        for (int k = 0; k < products.length; k++) {
            subtotal += products[k].calculateLineTotal();
        }

        return subtotal;
    }

    static double calculateDiscount(double subtotal) {

        if (subtotal > 1000) {
            return subtotal * 0.10;
        } else {
            return 0;
        }
    }

    static void displayTotals(
            double subtotal,
            double discount,
            double finalTotal
    ) {
        IO.println("Subtotal: R" + subtotal);
        IO.println("Discount: R" + discount);
        IO.println("Final total: R" + finalTotal);
        IO.println("=============================");
    }
   // for employee
    static void runEmployee() {
        Employee[] em = {
                new Employee(101, "Thabo", 8500),
                new Employee(102, "Lerato", 12500),
                new Employee(103, "Sipho", 22000),
                new Employee(104, "Naledi", 17500),
                new Employee(105, "Kabelo", 28000)
        };

        double threshold = 15000;

        displayEmployees(em);
        displayAboveThreshold(em, threshold);

        Employee highest = HighestPaid(em);

        IO.println("===== HIGHEST-PAID EMPLOYEE =====");
        IO.println("Name: " + highest.getName());
        IO.println("Salary: R" + highest.getSalary());
        IO.println("======Total======");
        IO.println("Total Salary: R" + calculateTotal(em));
        IO.println("Average Salary: R" + calculateAverage(em));
        IO.println("*********************************");
    }

    // Display every employee
    static void displayEmployees(Employee[] employees) {

        IO.println("===== ALL EMPLOYEES =====");

        for (int i = 0; i < employees.length; i++) {
            employees[i].displayDetails();
        }
    }

    // Display employees earning above the threshold
    static void displayAboveThreshold( Employee[] employees, double threshold) {

        IO.println("\n===== SALARIES ABOVE R" + threshold + " =====");

        for (int i = 0; i < employees.length; i++) {

            if (employees[i].getSalary() > threshold) {
                IO.println(employees[i].getName() + " - R" + employees[i].getSalary()
                );
            }
        }
    }

    // Find the employee with the highest salary
    static Employee HighestPaid(Employee[] employees) {

        Employee highest = employees[0];

        for (int k = 1;k < employees.length;k++) {

            if (employees[k].getSalary()
                    > highest.getSalary()) {

                highest = employees[k];
            }
        }

        return highest;
    }

    // Calculate total salary
    static double calculateTotal(Employee[] employees) {
        double total = 0;
        for (int k = 0; k < employees.length; k++) {
            total += employees[k].getSalary();
        }
        return total;
    }

    // Calculate average salary
    static double calculateAverage(Employee[] employees) {
        if (employees.length == 0) {
            return 0;
        }
        return calculateTotal(employees) / employees.length;
    }
}


