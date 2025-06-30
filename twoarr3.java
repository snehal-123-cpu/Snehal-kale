import java.util.Scanner;
public class twoarr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        int[][] matrix = new int[size][size];

        System.out.println("Enter " + (size * size) + " integers:");

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        System.out.println("\nMatrix is:");
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
