import java.util.Scanner;
public class scanner{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = input.nextInt();

        System.out.print("Enter value for b: ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("Good");
        } else if (b > a) {
            System.out.println("Bad");
        } else {
            System.out.println("Invalid");
        }

        input.close(); 
    }
}
