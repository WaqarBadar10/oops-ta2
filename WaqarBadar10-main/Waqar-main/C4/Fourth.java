package C4;

// Q4) Write a Java program to create a class called Employee with methods called work() and getSalary(). 
// Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 50000.0; // base salary
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is hiring");
    }

    void addEmployee() {
        System.out.println("Employee added to the system");
    }
}

public class Fourth {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();             // Output: HR Manager is hiring
        hr.addEmployee();      // Output: Employee added to the system
        System.out.println("Salary: " + hr.getSalary()); // Output: Salary: 50000.0
    }
}
