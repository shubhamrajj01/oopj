// -Write a program to perform following operations on user entered strings and a character –
// i) Change the case of the string
// ii) Reverse the string
// iii) Compare two strings
// iv) Insert one string into another string
// v) Convert the string to upper case and lower case
// vi) Check whether the character is present in the string and at which position
// vii) Check whether the string is palindrome or not.
// viii) Check the number of word, vowel and consonant in the string

// Input: Enter a String : amit
// Output: The string after changing the case is AMIT
// The string after reversing is tima
// package Lab 8;

import java.util.Scanner;

public class Lab8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inputString = scanner.nextLine();
        String upperCaseString = inputString.toUpperCase();
        System.out.println("The string after changing the case is " + upperCaseString);
        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println("The string after reversing is " + reversedString);
        System.out.print("Enter the second string for comparison: ");
        String secondString = scanner.nextLine();
        int diff = Math.abs(inputString.length() - secondString.length());
        System.out.println("The difference between ASCII value is " + diff);
        System.out.print("Enter the string to be inserted into the first string: ");
        String insertString = scanner.nextLine();
        String concatenatedString = inputString + " " + insertString;
        System.out.println("The string after insertion is: " + concatenatedString);
        System.out.println("Uppercase: " + upperCaseString);
        System.out.println("Lowercase: " + inputString.toLowerCase());
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        int position = inputString.indexOf(character);
        if (position != -1) {
            System.out.println("Position of entered character: " + (position + 1));
        } else {
            System.out.println("Entered character is not present");
        }
        if (isPalindrome(inputString)) {
            System.out.println("Entered string is palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }
        System.out.println("No. of words: " + inputString.split("\\s+").length);
        int vowels = countVowels(inputString);
        int consonants = inputString.replaceAll("[^a-zA-Z]", "").length() - vowels;
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);

        scanner.close();
    }
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}