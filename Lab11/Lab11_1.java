// Aim of the program- Write a program in Java using multi-threading which will display a counter value within a specified range with a gap of 5 milliseconds after setting it’s name as given by the user.
// Input : Name of the thread- First
//         Lower range of counter- 10
//         Upper range of counter- 15
//  Output : Thread- First
//  Counter- 10 11 12 13 14 15

import java.util.Scanner;

public class Lab11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the thread: ");
        String name = sc.nextLine();
        System.out.print("Enter the lower range of the counter: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper range of the counter: ");
        int upper = sc.nextInt();
        sc.close();
        New n = new New(name, lower, upper);
        n.start();
    }
}

class New extends Thread {
    int lower;
    int upper;

    public New(String name, int lower, int upper) {
        super(name);
        this.lower = lower;
        this.upper = upper;
    }

    public void run() {
        System.out.print("Thread Name: " + Thread.currentThread().getName() + "\nCounter:");
        for (int i = lower; i <= upper; i++) {
            System.out.print(" " + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
