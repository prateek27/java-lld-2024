package L03_OOPS;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        // Student s = new Student("A","A@gmail.com","SQL");
        // System.out.println(s);

        /* Player p = new Player();
        System.out.println(p.computeScore());
        System.out.println(p.computeScore(10));
        System.out.println(p.computeScore(10,8));
        System.out.println(p.computeScore("X",10));
         */

        //Object Reference is of parent datatype
        // Actual Object can be parent or child ..

        /* User u = new User("U","U@gmail.com");
        User s = new Student("A","A@gmail.com","SQL");

        System.out.println(u);
        System.out.println(s);
         */

        //Players
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        //static member is class level data member
        System.out.println(Player.count);
        System.out.println(p1.count);


        //Math Library
        System.out.println(Math.PI);
        System.out.println(Math.max(10,20));


        //Loosely Coupling
        PaymentMethod pm = getPaymentMethod();
        pm.pay(100); //Run Time Polymorphism: pay method works according to the type of object supplied at runtime, and has many forms.
    }

    public static PaymentMethod getPaymentMethod(){
        return new UPI();
    }




}
