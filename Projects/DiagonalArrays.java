import java.util.Arrays;
import java.util.Scanner;

public class DiagonalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the dimensions of arrays: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        //read the scanner elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter your dimensions: for " + i + " and " + j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        //initialize the sum of primary diagonal
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        //initialize sum of secondary diagonals
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            if (i != n - i - 1)
                sum2 += matrix[i][n - i - 1];
        }
        System.out.println(Arrays.deepToString(matrix)); //use deepToString method for 2D arrays
        System.out.println("Sum of  Primary Diagonal is: " + sum);
        System.out.println("Sum of  Secondary Diagonal is: " + sum2);

        scanner.close();
    }
}
