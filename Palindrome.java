public class Palindrome {
    public static void main(String[] args) {
        String str = "snehal"; 
        String reversed = " ";

    
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
