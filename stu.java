import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int[] marks = new int[5];
    int total = 0;
    double average;
    char grade;
    String result;
    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        average = total / 5.0;
    }
    void calculateGrade() {
        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 50)
            grade = 'D';
        else
            grade = 'F';
    }
    void checkResult() {
        boolean isFail = false;

        for (int i = 0; i < 5; i++) {
            if (marks[i] < 35) {
                isFail = true;
                break;
            }
        }

        if (isFail || grade == 'F')
            result = "FAIL";
        else
            result = "PASS";
    }
    void displayReport() {
        System.out.println("\n===== REPORT CARD =====");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);

        System.out.println("Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
        System.out.println("========================");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student s = new Student();

        s.inputDetails();
        s.calculateGrade();
        s.checkResult();
        s.displayReport();
    }
}