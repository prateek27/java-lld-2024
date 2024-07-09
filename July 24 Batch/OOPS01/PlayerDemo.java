package OOPS01;

public class PlayerDemo {
    public static void main(String[] args) {
        //Create objects of player
        Player player1 = new Player();
        Player player2 = new Player();
        player1.name = "Rahul";
        player2.name = "Akhil";
        Player player3 = player2;
        player3.name = "Amit";

        // player1.play();
        // player2.play();
        // player3.play();
        //Array of Players
        Player[] players = new Player[3];
        //put the exisiting objects or create new objects
        players[0] = player1;
        players[1] = player2;
        players[2] = new Player();
        players[2].name = "Rohan";

        for(Player p:players){
            p.play();
        }

        players = null; //array will be destroyed, rohan will be destroyed
        //garbage collection destroys unreachable memory objects

        //Math.random()
        //task to create a random b/w 1-9 [0,9.99999)
        player1.guess();
        System.out.println(player1.getGuessedNumber());
    }
}
