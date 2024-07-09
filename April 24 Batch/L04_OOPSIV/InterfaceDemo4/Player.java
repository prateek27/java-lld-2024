package L04_OOPSIV.InterfaceDemo4;

import java.util.Comparator;

public class Player implements Comparable<Player> {
    private int rank;
    private String name;
    private int age;

    Player(String name,int rank,int age){
        this.rank = rank;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Player o) {
        return this.rank - o.rank;
    }

    @Override
    public String toString() {
        return "Player{" +
                "rank=" + rank +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
