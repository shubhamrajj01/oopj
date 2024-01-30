//  Write a program in Java to create a class Rectangle having data
// members length and breadth and three methods called read, calculate and display to read
// the values of length and breadth, calculate the area and perimeter of the rectangle and display the result respectively.

import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        sc.close();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.display();
    }
}

class Rectangle {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void display() {
        System.out.println("Area of the rectagle = " + area());
        System.out.println("Perimeter of the rectangle = " + perimeter());
    }
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }
}
