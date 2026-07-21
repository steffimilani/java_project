class ATM {
    double balance = 5000;

    void checkBalance() {
        System.out.println("Balance: ₹" + balance);
    }
}

class BankATM extends ATM {
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        BankATM atm = new BankATM();

        atm.checkBalance();
        atm.deposit(2000);
        atm.withdraw(1000);
        atm.checkBalance();
    }
}