package C7;

// Q7) Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). 
// Create a subclass called Employee that adds a new method named getEmployeeId() and overrides 
// the getLastName() method to include the employee's job title.

class Person {
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private String employeeId;
    private String jobTitle;

    Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    String getEmployeeId() {
        return employeeId;
    }

    @Override
    String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}

public class Seventh {
    public static void main(String[] args) {
        Employee emp = new Employee("Ambuj", "Tripathi", "E001", "Software Engineer");
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName()); 
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }
}
// Output: 
// First Name: Ambuj
// Last Name: Tripathi (Software Engineer)
// Employee ID: E001
//PS C:\Users\ambuj\Desktop\OOps TA>
