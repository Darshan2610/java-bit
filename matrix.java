
import java.util.*;

public class addmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // if (args.length != 1) {
        //     System.out.println("Please provide the order N as a command line argument.");
        //     return;
        // }

        // // Parse N from command line argument
        // int N = Integer.parseInt(args[0]);

        // // Check if N is a positive integer
        // if (N <= 0) {
        //     System.out.println("Order N should be a positive integer.");
        //     return;
        // }
        int N = sc.nextInt();
        int[][] matrix1 = new int[N][N];
        int[][] matrix2 = new int[N][N];
        System.out.println("enter matrix 1 elements");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter matrix 2 elements");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] res = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Resultant Matrix: ");
        displayMatrix(matrix1);
        System.out.println("matrix 2");
        displayMatrix(matrix2);
        System.out.println("Addition Result : ");
        displayMatrix(res);
    }

    static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
