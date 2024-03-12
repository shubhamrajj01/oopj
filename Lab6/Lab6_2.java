// Write a class Account containing acc_no, balance as data members and two methods as input() for taking input from user and disp() method to display the details. Create a subclass Person which has name and aadhar_no as extra data members and override disp() function. Write the complete progrm to take and print details of three persons.

// Input: Enter details of three persons.
// Output: Display details of three persons.

import java.util.*;
public class Lab6_2 {
    public static void main(String[] args){
        Person person = new Person();
        person.input();
        person.disp();

    }
}

class Account {
    int acc_no;
    double balance;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number and balance");
        acc_no= sc.nextInt();
        balance = sc.nextInt();

    }

    void disp(){
        System.out.println("Account Number : "+acc_no+"\nBalance : "+balance);
    }
}
class Person extends Account{
    String name;
    int aadhar_no;
    Scanner scan = new Scanner(System.in);
    void input(){
        super.input(); // calling the method from parent class to initialize variables in parent class
        System.out.println("Enter the name and Aadhar number: ");
        name = scan.nextLine();
        aadhar_no = scan.nextInt();
    }
    
    @Override
    void disp(){
        super.disp();  // calling the method of parent class for displaying data of parent class
        System.out.println("Name: "+name +"\nAadhar Number: "+ aadhar_no);
    }
    // super.disp(); // Calling the method from parent class
    // super.input(); // Calling the method from parent class
}
