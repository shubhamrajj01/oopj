// Write a Program in Java to create a class Postpaid Bill to generate Postpaid mobile bill with the given data members Mobile number, customer_Id, bill_date, monthly transactions[5] and member functions get_PostPaidbill → to input all the details of given data members of the class, getTotalAmount → this method iterates through monthly Iransactions[5] and returns the total amount. public String validateData throws Mobile number should be of 10 digits, customer _id with 6 digit number should not be in alphanumeric format, bill date should be in dd-mm--yyyy format.

import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class PostpaidBill {
    String mobileNumber;
    String customerId;
    String billDate;
    double[] monthlyTransactions = new double[5];

    void get_PostPaidbill() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter mobile number:");
            mobileNumber = scanner.nextLine();
            System.out.println("Enter customer ID:");
            customerId = scanner.nextLine();
            System.out.println("Enter bill date (dd-MM-yyyy):");
            billDate = scanner.nextLine();
            System.out.println("Enter monthly transactions:");
            for (int i = 0; i < 5; i++) {
                monthlyTransactions[i] = scanner.nextDouble();
            }
        } finally {
            scanner.close();
        }
    }

    double getTotalAmount() {
        double total = 0;
        for (double transaction : monthlyTransactions) {
            total += transaction;
        }
        return total;
    }

    void validateData() throws InvalidInputException {
        if (mobileNumber.length() != 10 || !customerId.matches("\\d{6}") || billDate.matches("\\d{2}-\\d{2}-\\d{4}") ||  customerId.length() != 6)
        {
            throw new InvalidInputException("Exception occurred: Invalid input! Please enter a valid value.");
        }
    }

    public static void main(String[] args) {
        try {
            PostpaidBill bill = new PostpaidBill();
            bill.get_PostPaidbill();
            bill.validateData();
            System.out.println("Total amount: " + bill.getTotalAmount());
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
