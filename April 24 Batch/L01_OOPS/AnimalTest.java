package L01_OOPS;

public class AnimalTest {

    public static void makeNoise(Animal animal){
        for(int i=0;i<10;i++){
            animal.speak();
        }
    }


    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Cody";

        Cat c = new Cat();
        c.name = "Mano";

        d.sleep();
        d.speak();
        c.sleep();
        c.speak();

        //call
        makeNoise(c);

        Animal animal = new Animal();
        animal.name = "Random ANimal";
        System.out.println(animal.name);
    }
}
