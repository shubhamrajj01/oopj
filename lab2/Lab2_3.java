package Lab2;

// wap to input a three digit number and print sum of number without loop

import java.util.Scanner;

public class Lab2_3 {

    public static void main (String ags[]){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a three digit number: ");

        int num = scan.nextInt();
        int sum = 0;

        String numberAsString = Integer.toString(num);//converted number as string
        
        int length = numberAsString.length();//counted the length of the conveted string

        if (length == 3){
            int firstNumber = num / 100;
            int secondNumber = (num % 100) / 10;
            int lastNumber = num % 10;

            sum = firstNumber + secondNumber + lastNumber;
            System.out.println ("The sum of the digits is " + sum);            
        }
        else {
            System.out.println ("The number is not three digit");
        }
    }
}
