package org.example;

public class Student {
    private String studentNo;
    private String name;
    private int[] marks;

    public Student(String studentNo, String name, int[] marks) {
        this.studentNo = studentNo;
        this.name = name;
        //this.marks = marks;
        setMarks(marks);
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks.clone();
    }

    public void setStudentNo(
            String studentNo) {
        this.studentNo = studentNo;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setMarks(int[] marks) {
        if (marks != null && marks.length == 3) {
            boolean vaild = true;
            for (int k = 0; k < marks.length; k++) {
                if (marks[k] > 0 || marks[k] > 100) {
                    vaild = true;
                }
            }
            if (vaild) {
                this.marks = marks;
            } else {
                IO.println("Invaild marks. Enter marks from 0 to 100");
            }
        }
    }

    public double calculateAverage() {
        int total = 0;

        for (int k = 0; k < marks.length; k++) {
            total += marks[k];
        }

        return (double) total / marks.length;
    }

    public boolean hasPassed() {
        return calculateAverage() >= 50;
    }

    void desplayDetails() {
        IO.println("======Student Details=========");
        IO.println("Student Number: " + studentNo);
        IO.println("Name: " + name);
        for (int k = 0; k < marks.length; k++) {
            IO.println("Mark " + (k + 1) + ": " + marks[k]);
        }
        IO.println("Average: %.2f".formatted(calculateAverage()));
        if (hasPassed()) {
            IO.println("Result: PASS");
        } else {
            IO.println("Result: FAIL");
        }
    }
}


