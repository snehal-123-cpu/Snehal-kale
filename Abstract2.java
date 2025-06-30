abstract class Payment {
    abstract void processPayment(double amount);
}
class CreditCard extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment.");
    }
}
class UpiPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment.");
    }
}
public class Abstract2 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        p1.processPayment(600000);

        Payment p2 = new UpiPayment();
        p2.processPayment(600000);
    }
}
