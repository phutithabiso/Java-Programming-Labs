# Java Programming Labs

**Variables, If Statements, Arrays, Classes, and Objects**

![Java](https://img.shields.io/badge/Java-SE%208-orange?logo=openjdk)
![Level](https://img.shields.io/badge/Level-Beginner%20to%20Intermediate-blue)
![Status](https://img.shields.io/badge/Status-In%20Progress-yellow)

## Overview

Java Programming Labs is a hands-on programming practice repository designed to develop fundamental Java programming skills through practical exercises, problem-solving activities, debugging tasks, and a final Campus Store assessment.

The repository progresses from basic variables and decision-making to arrays, object-oriented programming, validation, calculations, and the development of a small inventory and point-of-sale system.

## Learning Objectives

By completing these labs, I aim to develop the ability to:

- Declare, initialise, and use Java variables and data types.
- Apply arithmetic operators and perform calculations.
- Use `if`, `else if`, and `else` statements for decision-making.
- Validate input and handle invalid values.
- Create, traverse, search, and manipulate arrays.
- Write loops to process collections of data.
- Design classes, create objects, and use constructors.
- Apply encapsulation using private fields and public methods.
- Implement methods with parameters and return values.
- Debug common programming errors.
- Build small applications that combine multiple programming concepts.
- Test solutions using normal, boundary, and invalid inputs.

## Technologies

- **Language:** Java
- **Target version:** Java SE 8
- **Development tools:** IntelliJ IDEA, Eclipse, Visual Studio Code, or another Java-compatible IDE
- **Version control:** Git and GitHub

## Repository Structure



Each lab has its own package to keep related exercises organised and prevent class-name conflicts.

## Lab Contents

### Lab 1: Variables and Data Types

**Topics:** Variables, data types, arithmetic operations, and output.

| Exercise | Description |
|---|---|
| 1.1 | Display student details |
| 1.2 | Calculate shopping totals and discounts |
| 1.3 | Convert temperatures between Celsius and Fahrenheit |

**Review:** Variable declaration, initialisation, numeric data types, and assignment versus equality.

### Lab 2: If Statements and Decision-Making

**Topics:** Conditions, comparison operators, logical operators, and string comparison.

| Exercise | Description |
|---|---|
| 2.1 | Determine whether a mark passes or fails |
| 2.2 | Calculate grades based on marks |
| 2.3 | Analyse positive, negative, zero, even, and odd numbers |
| 2.4 | Validate login credentials |

**Review:** Conditional execution, `else if`, `&&`, `||`, and `.equals()`.

### Lab 3: Arrays

**Topics:** Arrays, loops, searching, counting, and element manipulation.

| Exercise | Description |
|---|---|
| 3.1 | Store student marks and calculate totals and averages |
| 3.2 | Find the largest and smallest values |
| 3.3 | Search for values and report matching indexes |
| 3.4 | Count and separate even and odd numbers |
| 3.5 | Display and reverse an array |

**Review:** Zero-based indexing, array length, index bounds, and safe average calculations.

### Lab 4: Classes and Objects

**Topics:** Object-oriented programming, constructors, methods, and encapsulation.

| Exercise | Description |
|---|---|
| 4.1 | Create a Student class and test student objects |
| 4.2 | Implement a BankAccount with deposit and withdrawal validation |
| 4.3 | Manage product inventory and stock values |
| 4.4 | Calculate rectangle areas and perimeters |

**Review:** Classes versus objects, constructors, private fields, parameters, and return values.

### Lab 5: Combining the Concepts

**Topics:** Arrays of objects, calculations, validation, and application logic.

| Exercise | Description |
|---|---|
| 5.1 | Build a student results system |
| 5.2 | Create a mini point-of-sale system |
| 5.3 | Review employee salaries and calculate statistics |

These exercises combine classes, arrays, loops, conditions, and calculations to solve larger programming problems.

### Lab 6: Debugging and Code Quality

**Topics:** Identifying errors, correcting logic, and testing program behaviour.

| Exercise | Description |
|---|---|
| 6.1 | Correct String comparison using `.equals()` |
| 6.2 | Fix an array index boundary error |
| 6.3 | Correct the order of grade conditions |
| 6.4 | Test safe bank account withdrawals |

### Final Practical Assessment: Campus Store

The final project combines the concepts covered throughout the repository in a small campus store application.

**Required features:**

- A `Product` class with private fields, a constructor, and appropriate methods.
- An array containing at least five product objects.
- Product prices, quantities, and stock management.
- Product searches by ID or name.
- Validation of prices and quantities.
- Sale processing that prevents selling more stock than is available.
- Subtotal, discount, and final-total calculations.
- A receipt showing purchased items and totals.
- Clear output and meaningful variable and method names.
- Tests for valid sales, invalid input, empty stock, and selling the exact remaining quantity.

**Discount rule:** Apply the specified discount when the subtotal exceeds the assessment threshold.

## Getting Started

### Prerequisites

1. Install a JDK compatible with Java SE 8.
2. Install a Java IDE or use a terminal.
3. Clone this repository or download its source files.
4. Open the project in your chosen development environment.

### Clone the repository

```bash
git clone https://github.com/phutithabiso/java-programming-labs.git
cd java-programming-labs
```

### Compile and run an exercise

For a Java class without a package declaration:

```bash
javac StudentDetails.java
java StudentDetails
```

For a packaged class, compile from the project root and use the fully qualified class name. For example, when the source is under `src/main/java`:

```bash
javac -d out src/main/java/com/phutithabiso/javalabs/lab01_variables/StudentDetails.java
java -cp out com.phutithabiso.javalabs.lab01_variables.StudentDetails
```

Repeat the process for the exercise you want to run. Each exercise with a `main` method can be run independently.

If the project uses Maven, you can also compile the project with:

```bash
mvn compile
```

## Testing and Validation

Every exercise should be compiled, executed, and tested with different inputs.

Important test cases include:

- Valid and invalid marks.
- Zero and negative numbers.
- Empty arrays and repeated search values.
- Invalid array indexes.
- Valid and invalid deposits and withdrawals.
- Negative prices or quantities.
- Sales exceeding available stock.
- Empty inventory.
- Selling exactly the remaining stock.
- Subtotals below, equal to, and above the discount threshold.

The goal is to verify not only that the program works with expected inputs, but also that it behaves correctly at boundary conditions.

## Assessment Rubric

| Assessment area | Weight |
|---|---:|
| Variables and data types | 10% |
| If statements and validation | 15% |
| Arrays and loops | 20% |
| Classes, objects, constructors, and methods | 25% |
| Calculations and stock handling | 20% |
| Readability and testing | 10% |
| **Total** | **100%** |

## Submission Checklist

- [ ] All Java source files compile successfully.
- [ ] Each exercise has been tested.
- [ ] Class names and filenames match.
- [ ] Variables and methods use meaningful names.
- [ ] Invalid input is handled appropriately.
- [ ] Arrays are accessed using valid indexes.
- [ ] String contents are compared using `.equals()`.
- [ ] The Campus Store assessment includes a working demonstration.

## Progress Tracker

Use the following checklist to track your progress as you complete the exercises.

- [ ] Lab 1 — Variables and Data Types
- [ ] Lab 2 — If Statements and Decision-Making
- [ ] Lab 3 — Arrays
- [ ] Lab 4 — Classes and Objects
- [ ] Lab 5 — Combining the Concepts
- [ ] Lab 6 — Debugging and Code Quality
- [ ] Final Practical — Campus Store

## Learning Approach

For each exercise:

1. Understand the problem and identify the required inputs and outputs.
2. Plan the variables, conditions, loops, classes, and methods.
3. Write the solution using meaningful names.
4. Compile and run the program.
5. Test normal cases, boundary conditions, and invalid inputs.
6. Review the solution and explain how it works.

## Author

**Phuti Thabiso Phaka**

