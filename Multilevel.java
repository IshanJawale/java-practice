// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class 1
class Mammal extends Animal {
    void giveBirth() {
        System.out.println("Mammals give birth to live young.");
    }
}

// Derived class 2 (Multilevel inheritance)
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();

        // Access methods from the base class
        myDog.eat();  // Inherited from Animal

        // Access methods from the first derived class
        myDog.giveBirth();  // Inherited from Mammal

        // Access methods from the second derived class
        myDog.bark();  // Specific to Dog class
    }
}
