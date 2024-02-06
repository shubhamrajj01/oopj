//1. A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubicft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.
// Input: Enter dimensions
// Output: Display the cost of plastic

import java.util.*;

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, width and height: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        sc.close();

        Box box = new Box(length, width, height);
        Sheet sheet = new Sheet(length, width);

        System.out.println("Cost of 3D Box=" + box.cost3D());
        System.out.println("Cost of 2D Sheet=" + sheet.cost2D());
    }
}

class Box {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double cost3D() {
        return (length * width * height * 60);
    }
}

class Sheet {
    private double length, width;

    public Sheet(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double cost2D() {
        return (length * width * 40);
    }
}
