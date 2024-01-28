package Lab2;

// wap to calculate area of triangle with herons formula

import java.util.Scanner;

public class Lab2_4 {
    public static void main(String ags[]){
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter the sides of the triangle: ");
        int  a = scan.nextInt();
        int  b = scan.nextInt();
        int  c = scan.nextInt();

        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        
        System.out.println("The area of the triangle is: " + area);

    }
}
