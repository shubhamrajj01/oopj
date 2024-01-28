package Lab1;

import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        int mark = sc.nextInt();

        char grade;

        if (mark >= 90) {
            grade = 'O';
        } else if (mark >= 80) {
            grade = 'E';
        } else if (mark >= 70) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else {
            grade = 'C';
        }
    

        System.out.println("The corresponding grade is: " + grade);
    }
}

// Write a program to print the corresponding grade for the given mark using if..else statement in Java
// Input: Mention the grade in the program
// Output: Display the Grade either O/E/A/B/C