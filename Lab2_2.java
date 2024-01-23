// wap to calculate prime factor of a number
import java.util.*;

public class Lab2_2 {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Lab2_2 obj = new Lab2_2();
        obj.primeFactor();
    }

    public void primeFactor(){
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
    }
}