// :Write a class file – box with three data members(length, width,
// height) and a method volume() . Also implement the application class Demo where
// an object of the box class is created with user entered dimensions and volume is printed.

// Input: length,width and height.
// Output: Volume

public class Lab4_1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter length, width and height: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        sc.close();
        Box box = new Box(length, width, height);
        System.out.println("Volume=" + box.volume());
    }
}

class Box {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double volume() {
        return length * width * height;
    }
}

