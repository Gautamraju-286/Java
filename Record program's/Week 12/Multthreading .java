class BankAccount {

    private int balance = 10000;

    synchronized void withdraw(String person, int amount) {

        System.out.println(person + " is trying to withdraw "
                           + amount + " rupees.");

        if (amount <= balance) {

            System.out.println(person + " is withdrawing money...");

            balance = balance - amount;

            System.out.println(person + " successfully withdrew "
                               + amount + " rupees.");

            System.out.println("Balance remaining: " + balance);

        } else {

            System.out.println(person
                               + " - Insufficient balance.");
        }

        System.out.println();
    }
}

class Customer extends Thread {

    BankAccount account;
    String customerName;
    int amount;

    Customer(BankAccount account, String customerName, int amount) {

        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(customerName, amount);
    }
}

public class MultiThreading {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account, "Customer 1", 4000);
        Customer c2 = new Customer(account, "Customer 2", 3000);
        Customer c3 = new Customer(account, "Customer 3", 2000);
        Customer c4 = new Customer(account, "Customer 4", 2500);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
