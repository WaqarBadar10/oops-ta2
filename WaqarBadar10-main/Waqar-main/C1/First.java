// Q1) Write a Java program to create a class called Animal with a method called makeSound(). 
 // Create a subclass called Cat that overrides the makeSound() method to bark.
 
 class Animal {
     void makeSound() {
         System.out.println("Some generic animal sound");
     }
 }
 
 class Cat extends Animal {
     @Override
     void makeSound() {
         System.out.println("Bark"); // Unusual for a cat, but as per the question
     }
 }
 
 public class First {
     public static void main(String[] args) {
         Animal myAnimal = new Cat();
         myAnimal.makeSound(); // Output will be: Bark
     }
 }
