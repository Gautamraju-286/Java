interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }
}

public class UPIPayment {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(500);
    }
}
