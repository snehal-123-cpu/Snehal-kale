public class counter {
    public static void main(String[] args) {
        DigitCounter counter = new DigitCounter();
        int number = 12345; 
        int digitCount = counter.countDigits(number);
        System.out.println("Number of digits: " + digitCount);
    }
}

class counter2 {
    public int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}


