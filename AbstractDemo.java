// Abstract class
abstract class Animal {
    // Abstract method
    abstract void sound();

    // Non-abstract method
    void eat() {
        System.out.println("Animal eats");
    }
}


class Dog extends Animal {
    
    void sound() {
        System.out.println("Dog barks");
    }
}


public class AbstractDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();  
        myDog.eat();    
    }
}
