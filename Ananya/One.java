import java.util.*;
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class first {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int marks=sc.nextInt();
        try {

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks is not valid");
            } else {
                System.out.println("Accepted marks: " + marks);
            }
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}