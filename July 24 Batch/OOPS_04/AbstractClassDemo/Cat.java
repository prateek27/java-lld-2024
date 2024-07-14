package OOPS_04.AbstractClassDemo;

public class Cat extends Animal implements Pet{

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void makeFriend() {
        System.out.println(name +" cat is making friends");
    }
}
