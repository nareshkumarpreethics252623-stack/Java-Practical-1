// Interface
interface Payment {
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
public class InterfaceDemo {

    public static void main(String[] args) {

        CreditCardPayment payment = new CreditCardPayment();

        payment.pay();
    }
}