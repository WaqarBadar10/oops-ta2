package C8;

// Q8) Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
// Create a subclass called Circle that overrides the getPerimeter() and getArea() methods 
// to calculate the area and perimeter of a circle.

class Shape {
    double getPerimeter() {
        return 0.0;
    }

    double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Eight {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());
    }
}
/* Area of Circle: 78.53981633974483
Perimeter of Circle: 31.41592653589793
*/
