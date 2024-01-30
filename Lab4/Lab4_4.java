// Write a program to overload subtract method with various parameters in a class in Java. Write the driver class to use the different subtract methods using object.
// Input: Mention various subtract method having different parameters.
// Output: Subtract method will display the result accordingly
public class Lab4_4 {
    void subtract(int a, int b){
        System.out.println("Subtracting " + a + "(integer) and " + b + "(integer): " + (a - b));
    }

    void subtract(int a, int b, int c){
        System.out.println("Subtracting " + a + "(integer), " + b + "(integer) and " + c + "(double): " + (a - b - c));
    }
    void subtract(int a, double b){
        System.out.println("Subtracting " + a + "(integer) and " + b + "(double): " + (a - b));
    }
    public static void main(String[] args) {
        Lab4_4 obj = new Lab4_4();
        obj.subtract(10, 5);
        obj.subtract(10, 5, 2);
        obj.subtract(10, 5.5);
    }
}
