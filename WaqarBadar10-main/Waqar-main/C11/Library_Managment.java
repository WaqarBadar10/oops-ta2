package C11;

// Problem: Create a library system with Book, User, Student, and Faculty classes using OOP concepts.

class Book {
    String title; boolean isAvailable = true;
    Book(String t) { title = t; }
    void borrow() { isAvailable = false; }
    void returnBook() { isAvailable = true; }
}

class User {
    String name; int borrowLimit, booksBorrowed = 0;
    User(String n, int limit) { name = n; borrowLimit = limit; }
    void borrowBook(Book b) {
        if (booksBorrowed < borrowLimit && b.isAvailable) {
            b.borrow(); booksBorrowed++; System.out.println(name + " borrowed " + b.title);
        }
    }
    void returnBook(Book b) {
        b.returnBook(); booksBorrowed--; System.out.println(name + " returned " + b.title);
    }
}

public class Library_Managment {
    public static void main(String[] args) {
        Book b1 = new Book("Java"), b2 = new Book("DS");
        User s = new User("Student", 2), f = new User("Faculty", 5);
        s.borrowBook(b1); s.borrowBook(b2); s.returnBook(b1); f.borrowBook(b1);
    }
}
/* Output:
Student borrowed Java
Student borrowed DS
Student cannot borrow OOP
Student returned Java
Faculty borrowed Java
*/
