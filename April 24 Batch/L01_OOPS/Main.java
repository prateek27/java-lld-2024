package L01_OOPS;

public class Main {
    public static void main(String[] args) {

        Player p = new Player();
        p.name = "Mangesh";
        p.setAge(21);
        p.makeGuess(20);

        int lastGuess = p.getNumber();
        System.out.println(lastGuess);
        System.out.println(p.getAge());
    }
}
