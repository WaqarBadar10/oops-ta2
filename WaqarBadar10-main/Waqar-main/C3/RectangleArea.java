package C3;
// Q3) Write a Java program to create a class called Shape with a method called getArea(). 
// Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.



class Shape {
    double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Shape myShape = new Rectangle(5.0, 3.0);
        System.out.println("Area of Rectangle: " + myShape.getArea()); // Output: 15.0
    }
}
