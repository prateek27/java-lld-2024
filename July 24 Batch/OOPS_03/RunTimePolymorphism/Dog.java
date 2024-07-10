package OOPS_03.RunTimePolymorphism;

public class Dog extends Animal{

    void play(){
        System.out.println("Dog jumps!");
    }

    static void sayHi(){
        System.out.println("Hi from Dog");
    }
}
