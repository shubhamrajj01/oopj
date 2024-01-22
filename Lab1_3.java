import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day : ");
        int dayNumber = scanner.nextInt();

        int weekDay = (dayNumber % 7);

        String dayName = "";
        if(dayNumber >= 1 && dayNumber <= 31){
            switch (weekDay) {
                case 0:
                    dayName = "Sunday";//Calander month is Janauray 2024;
                    break;
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
            }
        System.out.println("The weekday for " + dayNumber + " Janauary is: " + dayName);
        }
        else{
            System.out.println("Invalid day number");
        }
    }
}
// Write a program to print the week day for the given day no. of  the current month using switch case statement
// Input: Mention the Day no in the program
// Output: Display the week day(either Sunday/Monday/Tuesday/Wednesday/Thursday/Friday/Saturday)