// package Lab10;

// Write a program in java which will accept a string from the keyboard and the program will do the following operations:
// 1.Check whether the String is palindrome or not.
// 2.Count the number of words in the String.

import java.util.*;

public class Lab10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inputString = sc.nextLine();

        StringBuffer inputBuffer = new StringBuffer(inputString);
        String reversedString = inputBuffer.reverse().toString();

        if(inputString.equals(reversedString)){
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }

        int count = inputBuffer.length();
        System.out.println("Total no of characters in the string: " + count);
        sc.close();


    }
}
