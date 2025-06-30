import java.util.Scanner;

public class TwoDarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        
        int[][] matrix = new int[rows][cols];


        System.out.print("Enter the elements of the matrix:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print("Element at (" + row + "," + col + "): ");
                matrix[row][col] = sc.nextInt();
            }
        }


        System.out.print("Matrix is:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
