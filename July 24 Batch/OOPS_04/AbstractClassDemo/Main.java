package OOPS_04.AbstractClassDemo;

public class Main {
    public static void main(String[] args) {
        //Here animal is abstract class
        Dog dog = new Dog("Jojo",10);
        Cat cat = new Cat("Miyaki",6);
        Lion lion = new Lion("Shera",11);

        dog.makeSound();
        cat.makeSound();
        lion.makeSound();

        dog.makeFriend();
        cat.makeFriend();

        dog.train();

        lion.eat();
        dog.eat();
        cat.eat();

    }
}
