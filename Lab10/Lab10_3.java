// Write a program to create user defined exceptions called HrsException, MinException and SecException. Create a class Time which contains data members hours, minutes, seconds and a method to take a time from user which throws the user defined exceptions if hours (>24 &<0),minutes(>60 &<0),seconds(>60 &<0).
// Input: Enter hours: 4
// Enter minutes: 54
// Enter seconds: 34
// Output: Correct Time-> 4:54:34
// Input: Enter hours: 30
// Enter minutes: 65
// Enter seconds: 65
// Output: Caught the exception
// Exception occurred: InvalidHourException:hour is not greater than 24
// Exception occurred: InvalidMinuteException:hour is not greater than60
// Exception occurred: InvalidSecondException:hour is not greater than 60


import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

public void setTime(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
    if (hours < 0 || hours > 24) {
        throw new HrsException("InvalidHourException: hour is not greater than 24");
    }

    if (minutes < 0 || minutes > 60) {
        throw new MinException("InvalidMinuteException: minute is not greater than 60");
    }

    if (seconds < 0 || seconds > 60) {
        throw new SecException("InvalidSecondException: second is not greater than 60");
    }

    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
}

public void displayTime() {
    System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
}
}

public class Lab10_3 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
        Time time = new Time();

            System.out.print("Enter hours: ");
            int hours = scanner.nextInt();

            System.out.print("Enter minutes: ");
            int minutes = scanner.nextInt();

            System.out.print("Enter seconds: ");
            int seconds = scanner.nextInt();

            time.setTime(hours, minutes, seconds);
            time.displayTime();
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getClass().getName() + ": " + e.getMessage());
        }

        scanner.close();
    }
}

