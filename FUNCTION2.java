import java.util.Scanner;
public class FUNCTION2 {
    public static int add(int a,int b) {
        return (a+b);
    }
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    
    System.out.println(" Enter the 1st number");
    int a= sc.nextInt();

    System.out.println("Enter the 2nd number:");
        int b = sc.nextInt();
        int result = add (a, b);
    System.out.println("Addition of " + a + " and " + b + " is: " + result);

    sc.close();
}
        
    }
    

