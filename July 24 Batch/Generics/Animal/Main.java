package Generics.Animal;

import java.util.List;

public class Main {
    public static void playWithAnimal(Animal a){
        a.makeSound();
    }
    //Cat or any of its parent datatype
    public static void main(String[] args) {
        Lion l = new Lion();
        Animal c = new Cat();
        playWithAnimal(l);
        playWithAnimal(c);
        //playWithSleepyAnimals(c);
    }
}
