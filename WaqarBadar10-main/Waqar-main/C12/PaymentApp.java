package C12;

// Problem: Use interface and abstract class for payment processing via different methods.

interface Payment { void pay(double amt); }

abstract class Transaction {
    void show() { System.out.println("Processing payment..."); }
}

class UPI extends Transaction implements Payment {
    public void pay(double amt) { show(); System.out.println("Paid " + amt + " via UPI"); }
}

class Card extends Transaction implements Payment {
    public void pay(double amt) { show(); System.out.println("Paid " + amt + " via Card"); }
}

public class PaymentApp {
    public static void main(String[] args) {
        Payment p = new UPI(); p.pay(500);
        p = new Card(); p.pay(1200);
    }
}
/* Output:
Processing payment...
Paid 500.0 via UPI
Processing payment...
Paid 1200.0 via Card
*/
