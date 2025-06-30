public class runtime {
    public static void main(String[] args) {
        
        Animal a1=new Animal();
        a1.sound();
        Dog d1=new Dog();
        d1.sound();

    }
}class Animal {
   

     void sound() { 
        System.out.println("animal is shouting");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("dog is barking");
    }
}