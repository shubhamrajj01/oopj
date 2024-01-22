// import java.util.Scanner;
import java.util.*;
public class Lab1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;
        int rem;

        while (number > 0) {
            rem = number % 10;
            reversedNumber = reversedNumber * 10 + rem;
            number = number / 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }

}
// Program to check a user entered number is palindrome or not
// Input: Mention the number in the program
// Output: display the number is Palindrome or not.

