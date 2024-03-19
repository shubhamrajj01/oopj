// package Lab10;
// Write a program in java if the marks is less than zero or greater than 100, then the program will throw an user defined exception and catch the same using necessary catch handler and display the message “Marks is not valid”, otherwise the accepted marks will be displayed.

import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class Lab10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the marks: ");
            int marks = sc.nextInt();
            if(marks <0 || marks > 100){
                throw new InvalidMarksException("Marks is not valid");
            }
            else{
                System.out.println("Marks: " + marks);
            }
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
