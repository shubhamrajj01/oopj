public class Lab3_2 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int even = 0;
        int odd = 0;
        
        for (int i = 0; i < 10; i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < 10; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
            if(arr[i] % 2 != 0){
                odd++;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
// Accept 10 numbers from command line and check how many of them are even and how many are odd.
//  Input: Enter 10 number from keyboard
//  Output: Display number of even and odd number