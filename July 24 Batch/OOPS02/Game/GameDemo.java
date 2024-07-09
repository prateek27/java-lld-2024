package Game;



public class GameDemo {
    public static void main(String[] args) {
        //you can create game with "N" players
        // you have use arraylist of players + forloop
        Game game = new Game("Ganga","Akhil","Sanjana");
        game.start();
        Game game2 = new Game("Puneet","Akhil","Prateek");
        game2.start();
    }
}
