interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        try {
            if (amount <= 0)
                throw new Exception("Invalid amount");
            System.out.println("UPI Payment: ₹" + amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(500);
    }
}
