package OOPS_04.AbstractClassDemo;

public class Dog extends Animal implements Pet,Trainable{
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Woof Woof!");
    }

    @Override
    public void makeFriend() {
        System.out.println(name + "dog is making friends");
    }

    @Override
    public void train() {
        System.out.println("Dog is getting trained");
    }
}
