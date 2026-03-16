package Lab07_Tasks;

class Payment {
    Payment(){}

    public void processPayment() {}
}

class CreditCard extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Payment Processed via Credit Card");
    }
}

class DebitCard extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Payment Processed via Debit Card");
    }
}

class PayPal extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Payment Processed via Pay Pal");
    }
}

class Main3 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new DebitCard();
        Payment p3 = new PayPal();
        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}