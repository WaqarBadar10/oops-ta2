package C20;

// Problem: Create a BankAccount class with overloaded constructors and deposit/withdraw methods.

class BankAccount {
    private String name;
    private double balance;

    BankAccount(String n) { name = n; balance = 0; } // Default balance
    BankAccount(String n, double b) { name = n; balance = b; }

    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) {
        if (amt <= balance) { balance -= amt; }
        else { System.out.println("Insufficient balance."); }
    }

    void display() {
        System.out.println(name + "'s Balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Alice");
        BankAccount a2 = new BankAccount("Bob", 1000);
        a1.deposit(500); a2.withdraw(200);
        a1.display(); a2.display();
    }
}

/* Output:
Alice's Balance: 500.0
Bob's Balance: 800.0
*/
