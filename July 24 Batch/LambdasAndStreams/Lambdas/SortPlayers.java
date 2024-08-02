package LambdasAndStreams.Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortPlayers {
    public static void main(String[] args) {
        Player p1 = new Player("Parth",5,24);
        Player p2 = new Player("Ganga",13,26);
        Player p3 = new Player("Sanjana",6,22);

        List<Player> players = new ArrayList<>(List.of(p1,p2,p3));
        //Option-1 Natural Ordering within the Player Itself
        Collections.sort(players);
        System.out.println(players);
        //Option-2 Comparator (Comparator Class OR use Lambda Expression)
        Collections.sort(players,new PlayerComparator());
        System.out.println(players);

        //Sort ->  Overloaded : Many signatures for the same function
        // Overloading means that there are multiple methods with the same name but different parameter lists within the same class
        //sort(List<T>, Comparator<? super T>)

        //Option-3 Lambda Expression
        Collections.sort(players,(a,b)->b.age-a.age);
        System.out.println(players);

        //Using Lambdas and Streams
        List<String> playerNames = players.stream()
                .filter(p->p.age>=24)
                .sorted((x,y)->(x.rank-y.rank))
                .map(p->p.name)
                .collect(Collectors.toList());


        String allPlayers = players.stream()
                .filter(p->p.age>=24)
                .sorted((x,y)->(x.rank-y.rank))
                .map(p->p.name)
                .collect(Collectors.joining());

        System.out.println(playerNames);
        System.out.println(allPlayers);
    }
}
