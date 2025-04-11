package polymorphism;

class PaymentMethod {
    public void processPayment() {
        System.out.println("Processing Payment...");
    }
}

class CreditCard extends PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("You can use credit card as payment.");
    }
}

class Paypal extends PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("You can use paypal as payment.");
    }
}

class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("You can also use bank transfer as payment.");
    }
}

public class poly1 {
    public static void main(String[] args) {
        
        PaymentMethod[] paymentMethod = new PaymentMethod[] {

            new CreditCard(),
            new Paypal(),
            new BankTransfer()
        };

        for (PaymentMethod p: paymentMethod) {
            p.processPayment();
        }


    }
}
 