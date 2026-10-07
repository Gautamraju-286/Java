class DigitalPayment {
    void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " successful");
    }
}

class UPI extends DigitalPayment {
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}

class Card extends DigitalPayment {
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Card");
    }
}

public class Main {
    public static void main(String[] args) {
        DigitalPayment p;

        p = new UPI();
        p.pay(500);

        p = new Card();
        p.pay(1000);
    }
}
