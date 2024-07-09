package L02_OOPSII;

import L01_OOPS.Animal;
import L01_OOPS.Player;

public class Main {
    public static void main(String[] args) {
        //Public - The access level of a public modifier is everywhere.
        // It can be accessed from within the class,
        // outside the class,
        // within the package and outside the package
        Player p = new Player();
        // p.name = "Prateek";
        // System.out.println(p.name);

        // Animal animal = new Animal();
        // animal.name = "Some Random Animal";
        Horse h = new Horse();
        h.setName("My Horse");
        System.out.println(h.getName());
        h.speak();
    }
}
