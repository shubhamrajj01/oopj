// Create an user defined exception named CheckArgument to check the number of arguments passed through command line. If the number of arguments is less than four then throw the Check Argument exception, else print the addition of squares of all the four elements.
// Input: 4 3 2 1
// Output : 30
// Input: 4 3 2
// Output : Exception occurred- CheckArgument

import java.util.Scanner;

public class Lab10_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four space-separated integers: ");
        String inputLine = scanner.nextLine();
        String[] inputStrings = inputLine.split(" ");
        if (inputStrings.length < 4) {
            System.out.println("Exception occurred: Please provide four arguments.");
        } else {
            try {
                int sumOfSquares = 0;
                for (String arg : inputStrings) {
                    int number = Integer.parseInt(arg);
                    sumOfSquares += number * number;
                }
                System.out.println("Sum of squares: " + sumOfSquares);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter integers only.");
            }
        }

        scanner.close();
    }
}