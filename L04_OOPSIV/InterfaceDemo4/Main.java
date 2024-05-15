package L04_OOPSIV.InterfaceDemo4;

import L03_OOPS.PaymentMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Tejas",5,28);
        Player p2 = new Player("Aman",3,20);
        Player p3 = new Player("Kiran",1, 29);

        //List interface
        List<Player> l = new ArrayList<>();
        l.add(p1);
        l.add(p2);
        l.add(p3);
        Collections.sort(l);
        System.out.println(l);
    }
}
