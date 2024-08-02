package LambdasAndStreams.Lambdas;

public class Player implements Comparable<Player> {
    String name;
    int rank;
    int age;

    Player(String name,int rank,int age){
        this.name = name;
        this.rank = rank;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Player o) {
        return this.name.compareTo(o.name);
    }
}
