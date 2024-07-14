package OOPS_04.PlayerDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerDemo {
    public static void main(String[] args) {
        Player p1 = new Player("Sanjana",3);
        Player p2 = new Player("Sunil",5);
        Player p3 = new Player("Devesh",2);
        Player p4 = new Player("Roshan",1);

        List<Player> players = new ArrayList<>();
        players.addAll(List.of(p1,p2,p3,p4));

        //sort it according to rank (Comparable Interface in our class)
        Collections.sort(players);

        //Comparator (Lambda Expressions)
        Collections.sort(players,(a,b)->a.name.compareTo(b.name));
        Collections.sort(players,(a,b)->a.rank - b.rank);


        System.out.println(players);
    }
}
