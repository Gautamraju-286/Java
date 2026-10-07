interface Wallet {
    void withdraw(double amount);
}

class DigitalWallet implements Wallet {
    double balance = 1000;

    public void withdraw(double amount) {
        try {
            if (amount > balance)
                throw new Exception("Insufficient Balance");

            balance = balance - amount;
            System.out.println("Payment Successful");
            System.out.println("Balance: " + balance);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class DigitalWalletSystem {
    public static void main(String[] args) {
        Wallet w = new DigitalWallet();
        w.withdraw(400);
    }
}
