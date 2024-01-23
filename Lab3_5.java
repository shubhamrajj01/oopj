// Find the no. of occurrence of each element in a user entered list of nos.
//  Input: Enter list of numbers e.g.( 15 25 15 11 25 32 15 32)
//  Output: Occurrence of 15=3
//          Occurrence of 25=2
//          Occurrence of 11=1

import java.util.Scanner;
public class Lab3_5{
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
        for (int i = 0; i < size; i++){
            for (int j = i+1; j < size; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
        }
        System.out.println("The numbers in ascending order are: ");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int count = 1;
        for (int i = 0; i < size; i++){
            if (i == size-1){
                System.out.println("Occurrence of " + arr[i] + "=" + count);
                break;
            }
            if (arr[i] == arr[i+1]){
                count++;
            }
            else{
                System.out.println("Occurrence of " + arr[i] + "=" + count);
                count = 1;
            }
        }
    }
}