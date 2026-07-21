class ATM {
    private double balance;

    // Constructor
    ATM(double balance) {
        this.balance = balance;
    }

    // Getter method
    double getBalance() {
        return balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(5000);

        atm.deposit(2000);
        atm.withdraw(1000);

        System.out.println("Current Balance: ₹" + atm.getBalance());
    }
}