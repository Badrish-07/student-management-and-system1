Problem Statement:

Design and implement a Student Academic Management System using Java that allows users to:

1.Record student details (name and roll number)
2.Input marks for multiple subjects
3.Calculate total marks and average
4.Assign grades based on performance
5.Determine pass/fail status
6.Generate and display a structured report card

Objective:
The objective of this project is to automate the process of managing student academic records and evaluating performance efficiently 
using basic Java programming concepts such as classes, arrays, loops, and conditional statements.

System Description:
The system is built using Object-Oriented Programming (OOP) principles in Java. It uses a Student class to encapsulate all student-related data and operations.
The program performs the following steps:
Accepts input from the user
Processes the data (calculations and grading)
Displays the final report card

Module Description
1. Input Module (inputDetails)
Takes student name and roll number
Accepts marks for 5 subjects using a loop
Calculates the total marks
Computes the average marks

2. Grade Calculation Module (calculateGrade)
Assigns grade based on average:
A → 90 and above
B → 75 to 89
C → 60 to 74
D → 50 to 59
F → below 50

3. Result Evaluation Module (checkResult)
Checks if any subject mark is below 35
If yes → student is marked as FAIL
Otherwise → PASS
Also considers grade ‘F’ as fail

4. Report Generation Module (displayReport)
Displays:
Student details
Subject-wise marks
Total and average
Grade
Final result (Pass/Fail)

Working Explanation:
A Student object is created in the main class.
The program calls methods in sequence:
inputDetails() → collects and stores data
calculateGrade() → determines grade
checkResult() → evaluates pass/fail
displayReport() → prints final output
Arrays are used to store marks efficiently.
Loops simplify input and processing of multiple subjects.
Conditional statements (if-else) are used for grading and result logic.

Conclusion
This project demonstrates how basic Java programming concepts can be applied to build a practical academic management system.
 It improves efficiency in handling student records and ensures consistent evaluation of performance.


