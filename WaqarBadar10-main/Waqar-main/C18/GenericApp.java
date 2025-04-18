package C18;

// Problem: Create generic Order class using bounded types.

class MenuItem { String name; MenuItem(String n) { name = n; } }

class Order<T extends MenuItem> {
    T item;
    Order(T i) { item = i; }
    void print() { System.out.println("Ordered: " + item.name); }
}

public class GenericApp {
    public static void main(String[] args) {
        Order<MenuItem> o = new Order<>(new MenuItem("Burger")); o.print();
    }
}

/* Output:
Ordered: Burger
*/
