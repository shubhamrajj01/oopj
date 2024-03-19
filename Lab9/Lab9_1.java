// Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement.
// Input: Enter the numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
// Output: Exception in thread “main”
// java.lang.ArrayIndexOutOfBoundsException:4


import java.util.Scanner;

public class Lab9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the number: ");
        int size = scanner.nextInt();
        System.out.println("Enter the numbers:");
        int[] numbers = new int[size]; // array size is 4

        try {
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
}
}
