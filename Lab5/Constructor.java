// 2. Illustrate the execution of constructors in multi-level inheritance with three Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick) where box inherits from plate and woodbox inherits from box class. Each class has constructor where dimensions are taken from user.
// Input: Enter the dimensions
// Output: Display the dimensions accordingly

import java.util.*;

public class Constructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length, width, height, and thickness: ");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int thick = scanner.nextInt();

        WoodBox woodBox = new WoodBox(length, width, height, thick);

        System.out.println("Dimensions of the wood box:");
        System.out.println("Length: " + wowwodBox.length);
        System.out.println("Width: " + woodBox.width);
        System.out.println("Height: " + woodBox.height);
        System.out.println("Thickness: " + woodBox.thick);
    }
}

class Plate {
    int length, width;

    Plate(int length, int width) { 
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called");
    }
}

class Box extends Plate { 
    int height;

    Box(int length, int width, int height) { 
        super(length, width); 
        this.height = height;
        System.out.println("Box constructor called");
    }
}

class WoodBox extends Box {
    int thick;

    WoodBox(int length, int width, int height, int thick) { 
        super(length, width, height); 
        this.thick = thick;
        System.out.println("WoodBox constructor called");
    }
}
