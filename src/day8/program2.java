class ATM {
    void withdraw() {
        System.out.println("ATM withdrawal");
    }
}

class DebitCard extends ATM {
    @Override
    void withdraw() {
        System.out.println("Withdraw using Debit Card");
    }
}

class CreditCard extends ATM {
    @Override
    void withdraw() {
        System.out.println("Withdraw using Credit Card");
    }
}

public class Main {
    public static void main(String[] args) {
        ATM a;

        a = new DebitCard();
        a.withdraw();

        a = new CreditCard();
        a.withdraw();
    }
}