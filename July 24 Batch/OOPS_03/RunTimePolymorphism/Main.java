package OOPS_03.RunTimePolymorphism;

public class Main {

    //Generic Method to accept any kind of animal
    static void playWithAnimal(Animal a){
        a.play(); //will bind with child class
        // a.sayHi(); //static method always bind with parents method and you should not call it like this
        Animal.sayHi();
    }

    static void playWithAnimal(Animal[] animals){
        for(Animal animal:animals){
            animal.play(); //run time polymorphism
        }
    }

    public static void main(String[] args) {
        playWithAnimal(new Cat());
        Animal[] animals = {new Dog(),new Cat(),new Horse(),new Lion()};
        playWithAnimal(animals);

        //Ideal Scenario, you should not over-ride static methods in child class
        /*
        Animal a1 = new Animal();
        a1.play();
        Animal a2 = new Dog();
        a2.play(); //Run time polymorphism

        Cat c = new Cat();
        a2 = c;
        a2.play();  //run time polymorphism

        Animal h = new Horse();
        h.play(); //inherited play of horse = same as animals play method

        //static methods should be called with class name
        Animal.sayHi(); //

        a2.play(); // cat's play method

        Dog d = new Dog();
        //static methods should be called with class name
        Dog.sayHi();
         */
    }
}
