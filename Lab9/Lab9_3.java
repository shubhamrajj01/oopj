// Write a Java class which has a method called
// ProcessInput(). This method checks the number entered by the user. If the
// entered number is negative then throw an user defined exception called
// NegativeNumberException, otherwise it displays the double value of the entered
// number.
// Input: Enter a number
// Output: Double value: 8
// Input: Enter a number -4
// Output: Caught the exception
// Exception occurred: NegativeNumberException: number should be positive

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Lab9_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new NegativeNumberException("Number should be positive");
            } else {
                System.out.println("Double value: " + 2 * number);
            }
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getClass().getName() + ": " + e.getMessage());
        }
        scanner.close();
    }
}