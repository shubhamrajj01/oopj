// Write a program in java to input and display the details of n number of students having roll, name and cgpa as data members. Also display the name of the student having lowest cgpa.

// Input: Enter Roll No, Name and cgpa of ‘n’ number of students.
// Output: Display the details of ‘n’ number of students. Also display the name of student with lowest cgpa
import java.util.Scanner;
public class Lab4_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter roll, name and cgpa of student " + (i + 1) + ": ");
            int roll = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();
            students[i] = new Student(roll, name, cgpa);
        }
        sc.close();
        System.out.println("Details of students: ");
        for(int i = 0; i < n; i++){
            students[i].display();
        }
        System.out.println("Student with lowest cgpa: ");
        Student lowest = students[0];
        for(int i = 1; i < n; i++){
            if(students[i].getCgpa() < lowest.getCgpa()){
                lowest = students[i];
            }
        }
        lowest.display();            
    }
}
class Student{
    private int roll;
    private String name;
    private double cgpa;
    public Student(int roll, String name, double cgpa){
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
    public void display(){
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
    public double getCgpa(){
        return cgpa;
    }
}