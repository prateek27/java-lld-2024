package L04_OOPSIV.InterfaceDemo2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        System.out.println(c.getArea());

        Rectangle r = new Rectangle(10,2);
        System.out.println(r.getArea());

        List<Shape> l = new ArrayList<>();
        l.add(c);
        l.add(r);

        for(Shape s:l){
            System.out.println(s.getArea());
        }

        Picture pic = new Picture("Monkey");

        //Create a List of objects and call the draw method
        List<Drawable> ld = new ArrayList<>();
        ld.add(r);
        ld.add(c);
        ld.add(pic);

        for(Drawable d : ld){
            d.draw(); //polymorphism
        }
    }

}
