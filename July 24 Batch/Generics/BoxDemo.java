package Generics;

import java.util.ArrayList;
import java.util.List;

public class BoxDemo {
    public static void main(String[] args) {
        BoxThree<Integer,Integer> b1 = new BoxThree<>(10,20);
        BoxThree<Integer,String> b2 = new BoxThree<>(10,"Hello");
        BoxThree<Integer, List<String> > b3 = new BoxThree<>(4,new ArrayList<>(List.of("apple","mango","guava")));

        List<String> fruits = b3.getSecond();
        System.out.println(fruits);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        /*
        BoxTwo<Integer> b1 = new BoxTwo<>(10,20); //holds only ints
        BoxTwo<String> b2 = new BoxTwo<>("hello","world");//only strings

        Integer v1 = b1.getX();
        String v2 = b2.getX();
        System.out.println(v1);
        System.out.println(v2);
         */


        /*
        Box b1 = new Box(10,20);
        Box b2 = new Box("Hello",5);

        Integer v1 = (Integer)b1.x;
        System.out.println(v1 + 5);


        //Runtime Exception - which is not a good thing
        //Catch max errors during compile time
        Integer v2 = (Integer)b2.x;
        System.out.println(v1 + 5);

        System.out.println(b1);
         */
    }
}
