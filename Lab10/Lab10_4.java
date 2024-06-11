// Create an user defined exception named CheckArgument to check the number of arguments passed through command line. If the number of arguments is less than four then throw the Check Argument exception, else print the addition of squares of all the four elements.
// Input: 4 3 2 1
// Output : 30
// Input: 4 3 2
// Output : Exception occurred- CheckArgument

import java.util.Scanner;

class CheckArgument extends Exception{
    public CheckArgument(String message){
        super(message);
    }
}

public class Lab10_4 {

    public static void main(String[] args) {
        try {
            int sumOfSquares = 0;
            if (args.length < 4) {
                throw new CheckArgument("Exception occurred- CheckArgument");                
            }
            else{
                for (int i = 0; i < args.length; i++) {
                    int number = Integer.parseInt(args[i]);
                    sumOfSquares += number * number;
                }
                System.out.println("Sum of squares: " + sumOfSquares);
            }
        }
        catch (CheckArgument c) {
            System.out.println(c.getMessage());
        }
    }
}