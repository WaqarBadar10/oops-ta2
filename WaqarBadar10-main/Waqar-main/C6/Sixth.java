package C6;

// Q6) Write a Java program to create a class called Animal with a method named move(). 
// Create a subclass called Cheetah that overrides the move() method to run.

class Animal {
    void move() {
        System.out.println("Animal is moving");
    }
}

class Cheetah extends Animal {
    @Override
    void move() {
        System.out.println("Cheetah is running fast");
    }
}

public class Sixth {
    public static void main(String[] args) {
        Animal myAnimal = new Cheetah();
        myAnimal.move(); // Output: Cheetah is running fast
    }
}
