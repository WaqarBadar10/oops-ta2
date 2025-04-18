package C14;

// Problem: Use ArrayList and packages to build a basic cart system.

import java.util.*;

class Product {
    String name; double price;
    Product(String n, double p) { name = n; price = p; }
}

public class Cart {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();
        cart.add(new Product("Pen", 10)); cart.add(new Product("Book", 50));
        double total = 0;
        for (Product p : cart) total += p.price;
        System.out.println("Total: " + total);
    }
}
/* Output:
Total: 60.0
*/
