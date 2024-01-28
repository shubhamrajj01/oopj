// wap to calculate the roots of a qudratic equation and find roots are imaginary or real

import java.util.Scanner;

public class Lab2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter the 'a', 'b', 'c' for the quadratic Equation ax^2+bx+c=0: ");
        int  a = scan.nextInt();
        int  b = scan.nextInt();
        int  c = scan.nextInt();

        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.println("The roots are " + root1 + " and " + root2);
        }
        else if (determinant == 0) {
            double root1 = -b / (2 * a);

            System.out.println("The root is " + root1);
        }
        else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);

            System.out.println("The roots are " + real + " + " + imaginary + "i and " + real + " - " + imaginary + "i");
        }
    }    
}
