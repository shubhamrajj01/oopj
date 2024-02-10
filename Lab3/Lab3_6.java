// package Lab3

// Findsumofeachdiagonal (left&right)elementsseparatelyof  auserentered3X3matrixinJava.
// Input: Enter3X3matrix
// e.g. 673
// 892
// 129
// Output: Left=24
// Right=13
public class Lab3_6 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int left = 0, right = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter 3X3 matrix: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){ 
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The matrix is: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){ 
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++){
            left += arr[i][i];
            right += arr[i][2-i];
        }
        System.out.println("Left=" + left);
        System.out.println("Right=" + right);
    }
        
}
