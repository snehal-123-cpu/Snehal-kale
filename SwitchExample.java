import java.util.Scanner;
public class SwitchExample {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int numb = 2; 
        switch (numb) {
            case 1:
                System.out.println("Good morning");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
