package Generics.Animal;

public class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Meoowww...");
    }
    void sleep(){
        System.out.println("Cat is sleeping");
    }
}
