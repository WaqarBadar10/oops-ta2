package C10;

// Q10) Write a Java program that creates a class hierarchy for employees of a company. 
// The base class should be Employee, with subclasses Manager, Developer, and Programmer. 
// Each subclass should have properties such as name, address, salary, and job title. 
// Implement methods for calculating bonuses, generating performance reports, and managing projects.

class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    double calculateBonus() {
        return salary * 0.1; // 10% bonus for base employee
    }

    void generatePerformanceReport() {
        System.out.println("Generating performance report for " + name);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, String address, double salary, String jobTitle, String department) {
        super(name, address, salary, jobTitle);
        this.department = department;
    }

    @Override
    double calculateBonus() {
        return salary * 0.2; // Managers get 20% bonus
    }

    void manageProjects() {
        System.out.println(name + " is managing projects in the " + department + " department.");
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    double calculateBonus() {
        return salary * 0.15; // Developers get 15% bonus
    }

    void developSoftware() {
        System.out.println(name + " is developing software using " + programmingLanguage + ".");
    }
}

class Programmer extends Developer {
    String framework;

    Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage, String framework) {
        super(name, address, salary, jobTitle, programmingLanguage);
        this.framework = framework;
    }

    @Override
    double calculateBonus() {
        return salary * 0.18; // Programmers get 18% bonus
    }

    void writeCode() {
        System.out.println(name + " is writing code using the " + framework + " framework.");
    }
}

public class Tenth {
    public static void main(String[] args) {
        Manager manager = new Manager("John", "123 Main St", 80000, "Manager", "IT");
        Developer developer = new Developer("Alice", "456 Oak St", 70000, "Developer", "Java");
        Programmer programmer = new Programmer("Bob", "789 Pine St", 60000, "Programmer", "Python", "Django");

        System.out.println("Manager Bonus: " + manager.calculateBonus());
        System.out.println("Developer Bonus: " + developer.calculateBonus());
        System.out.println("Programmer Bonus: " + programmer.calculateBonus());

        manager.manageProjects();
        developer.developSoftware();
        programmer.writeCode();
    }
}
/*Manager Bonus: 16000.0
Developer Bonus: 10500.0
Programmer Bonus: 10800.0
John is managing projects in the IT department.
Alice is developing software using Java.
Bob is writing code using the Django framework.
PS C:\Users\ambuj\Desktop\OOps TA>  */
