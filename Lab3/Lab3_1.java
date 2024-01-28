package Lab3;

public class Lab3_1 {
    public static void main(String[] args) {
        int a,b,c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        int largest = a;
        
        if (b > largest){
            largest = b;
        }
        if (c > largest){
            largest = c;
        }

        System.out.println("The largest among the three is: " + largest);
    }
}
// Find the largest among 3 user entered nos. at the command prompt using Java
// Input: Enter three number .
// Output: Display the Largest Number