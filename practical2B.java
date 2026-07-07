// Interface
interface Payment {

    // Abstract method
    void pay();
}

// Implementing class
class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}

// Main class
public class practicalno2B {

    public static void main(String[] args) {

        CreditCardPayment payment = new CreditCardPayment();

        payment.pay();
    }
}