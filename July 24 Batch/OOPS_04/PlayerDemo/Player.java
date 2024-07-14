package OOPS_04.PlayerDemo;

public class Player implements Comparable<Player> {
    String name;
    int rank;

    Player(String name,int rank){
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }

    @Override
    public int compareTo(Player o) {
        return rank - o.rank;
    }
}
