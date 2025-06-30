public class  prime {
    public static void main(String[] args) {
        System.out.println("Prime numbers up to 10 are:");

        for (int num = 2; num <= 10; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num ; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) { 
                System.out.println(num);
            }
        }
    }
}


