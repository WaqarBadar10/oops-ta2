package C16;

// Problem: Use try-catch, throw, throws for custom banking exceptions.

class InsufficientFunds extends Exception {
    InsufficientFunds(String msg) { super(msg); }
}

class Bank {
    double balance = 1000;
    void withdraw(double amt) throws InsufficientFunds {
        if (amt > balance) throw new InsufficientFunds("Low Balance");
        balance -= amt;
        System.out.println("Withdrawn: " + amt);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Bank b = new Bank();
        try { b.withdraw(1500); } catch (InsufficientFunds e) { System.out.println(e.getMessage()); }
    }
}
/* Output:
Low Balance
*/
