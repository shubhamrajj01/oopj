import java.util.Arrays;
import java.util.Scanner;

public class Lab3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the elements in array: ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        Arrays.sort(arr);
        // for (int i = 0; i < size; i++){
        //     for (int j = i+1; j < size; j++){
        //         if (arr[i] > arr[j]){
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp; 
        //         }
        //     }
        // }
        System.out.println("The numbers in ascending order are: ");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    
    }
}

// Program to sort the user entered list of numbers of any size
// Input: List of Numbers
// Output: Display the numbers in Ascending order