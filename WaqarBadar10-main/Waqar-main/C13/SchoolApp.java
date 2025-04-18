package C13;

// Problem: Use inheritance, method overriding and overloading to manage school roles.

class Person {
    String name;
    Person(String n) { name = n; }
    void getDetails() { System.out.println("Name: " + name); }
}

class Student extends Person {
    Student(String n) { super(n); }
    void getDetails() { super.getDetails(); System.out.println("Role: Student"); }
}

class Teacher extends Person {
    Teacher(String n) { super(n); }
    void getDetails() { super.getDetails(); System.out.println("Role: Teacher"); }
}

public class SchoolApp {
    public static void main(String[] args) {
        new Student("Alice").getDetails();
        new Teacher("Bob").getDetails();
    }
}
/* Output:
Name: Alice
Role: Student
Name: Bob
Role: Teacher
*/
