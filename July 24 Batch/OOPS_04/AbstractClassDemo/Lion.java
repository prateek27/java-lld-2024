package OOPS_04.AbstractClassDemo;

public class Lion extends Animal{
    Lion(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Roar...");
    }
}
