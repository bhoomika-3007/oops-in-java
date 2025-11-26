// Abstract Class

abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid via Credit Card: " + amount);
    }
}

class UpiPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

class CashPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid in Cash: " + amount);
    }

    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.pay(500);

        p = new UpiPayment();
        p.pay(300);

        p = new CashPayment();
        p.pay(200);
    }
}
