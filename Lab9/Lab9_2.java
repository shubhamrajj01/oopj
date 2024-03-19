// Write a Java program to handle an ArithmeticException
// using try, catch, and finally block.
// Input: Operand values for division operation mentioned in the program
// Output: ArithmeticException caught by try-catch-finally block
import java.util.Scanner;

public class Lab9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        } finally {
            System.out.println("Finally block executed");
        }

        scanner.close();
    }
}