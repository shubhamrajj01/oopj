package Lab2;

// wap to calculate the HCF of a number.
import java.util.Scanner;

public class Lab2_1 {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Lab2_1 obj = new Lab2_1
        ();
        obj.hcf();
    }
    public void hcf() {
        System.out.print("Enter two numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int hcf = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        System.out.println("HCF of " + a + " and " + b + " is " + hcf);
    }
    
}