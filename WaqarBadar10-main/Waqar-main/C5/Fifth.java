package C5;

// Q5) Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals 
// if the account balance falls below one hundred.

class BankAccount {
    protected double balance;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Minimum balance of 100 must be maintained.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class Fifth {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(500);
        myAccount.withdraw(450); // Denied
        myAccount.withdraw(300); // Allowed
        System.out.println("Current Balance: " + myAccount.getBalance());
    }
}
//output:-
/*Withdrawal denied! Minimum balance of 100 must be maintained.
Withdrew: 300.0
Current Balance: 200.0
PS C:\Users\ambuj\Desktop\OOps TA>  */
