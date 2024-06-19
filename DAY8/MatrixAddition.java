
import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {

    static int[][] matrixAddition(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] matSum = new int[rows][cols];

        if (rows != mat2.length || cols != mat2[0].length) {
            System.out.println("Addition is impossible...!");
            return null;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matSum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return matSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrices: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns in the matrices: ");
        int cols = sc.nextInt();

        int[][] mat1 = new int[rows][cols];
        System.out.println("Enter the Matrix1 Elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        int[][] mat2 = new int[rows][cols];
        System.out.println("Enter the Matrix2 Elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        int[][] sum = matrixAddition(mat1, mat2);
        if (sum != null) {
            System.out.println("Sum of the matrices:");
            for (int[] row : sum) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
}
