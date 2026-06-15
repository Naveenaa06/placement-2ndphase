import java.util.Scanner;

public class RotateMatrixAnticlockwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Request matrix dimension from user
        System.out.print("Enter the size of the square matrix (N x N): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Step 2: Fill matrix with user input
        System.out.println("Enter the elements of the matrix row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        // Step 3: Perform rotation
        rotateAnticlockwise(matrix);

        // Display rotated results
        System.out.println("\nMatrix Rotated 90 Degrees Anticlockwise:");
        printMatrix(matrix);

        scanner.close();
    }

    // Core logic method to rotate the matrix in-place
    public static void rotateAnticlockwise(int[][] matrix) {
        int n = matrix.length;

        // Phase A: Transpose the matrix (swap matrix[i][j] with matrix[j][i])
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Phase B: Reverse each column
        for (int j = 0; j < n; j++) {
            int top = 0;
            int bottom = n - 1;
            while (top < bottom) {
                int temp = matrix[top][j];
                matrix[top][j] = matrix[bottom][j];
                matrix[bottom][j] = temp;
                top++;
                bottom--;
            }
        }
    }

    // Helper utility to output the array structured cleanly
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}