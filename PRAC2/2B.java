package practical2b;

interface Payment {
    void pay(double amount);
    void showPaymentMode();
}


class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card.");
    }

    @Override
    public void showPaymentMode() {
        System.out.println("Payment Mode: Credit Card");
    }
}

class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI.");
    }

    @Override
    public void showPaymentMode() {
        System.out.println("Payment Mode: UPI");
    }
}

// Main class
public class PRACTICAL2B {

    public static void main(String[] args) {

        Payment payment1 = new CreditCardPayment();
        payment1.showPaymentMode();
        payment1.pay(2500);

        System.out.println();

        Payment payment2 = new UpiPayment();
        payment2.showPaymentMode();
        payment2.pay(850);
    }
}
