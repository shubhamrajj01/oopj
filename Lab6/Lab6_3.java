// Illustrate the usage of abstract class with following Java classes
// An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and an abstract method course()
//  A subclass ‘kiitian’ with course() method implementation

// Write the driver class to print the all details of a kiitian object.
// Input - Rollno - 2205180
// Registration no - 1234567890
// Output -Rollno - 2205180
// Registration no - 1234567890
// Course - B.Tech. (Computer Science & Engg)
import java.util.Scanner;
public class Lab6_3 {
    public static void main(String[] args) {

        // Student student = new kiitian();
        kiitian kiit = new kiitian();
        kiit.getinput();
        kiit.course();
    }
}
abstract class Student{
    int roll_no;
    int reg_no;
    
    Scanner sc = new Scanner(System.in);
    void getinput(){
        roll_no = sc.nextInt();
        reg_no = sc.nextInt();
        System.out.println("Rollno - "+roll_no+ " \nRegistration no - "+reg_no);
    }

    abstract void course();
}

class kiitian extends Student{
    void getinput(){
        super.getinput();
        
    }
    void course(){
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}