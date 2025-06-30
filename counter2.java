
import java.util.Scanner;

class DigitCounter {
    public int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}

public class counter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();
        DigitCounter counter = new DigitCounter();
        System.out.println("Number of digits: " + counter.countDigits(input));
        scanner.close();
    }
}
