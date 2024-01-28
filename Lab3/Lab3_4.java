// Program to find no. of objects created out of a class using ‘static’ modifier.
//  Input: No of objects created
//  Output: Display the number of objects created (e.g. no of objects=3)
package Lab3;
public class Lab3_4 {

    static int count = 0;

    Lab3_4(){
        count++;
    }

    public static void main(String[] args) {
        Lab3_4 obj1 = new Lab3_4();
        Lab3_4 obj2 = new Lab3_4();
        Lab3_4 obj3 = new Lab3_4();
        Lab3_4 obj4 = new Lab3_4();
        Lab3_4 obj5 = new Lab3_4();
        Lab3_4 obj6 = new Lab3_4();
        Lab3_4 obj7 = new Lab3_4();
        Lab3_4 obj8 = new Lab3_4();
        Lab3_4 obj9 = new Lab3_4();
        Lab3_4 obj10 = new Lab3_4();
        System.out.println("No of objects created: " + count);
    }
}