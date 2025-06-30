import java.util.Scanner;

public class Concatenation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter second string: ");
        String second = scanner.nextLine();

        
        String result = first + second;

        System.out.println("Concatenated string: " + result);

        scanner.close();
    }
}
