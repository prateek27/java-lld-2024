package L02_OOPSII.Game;

public class Player {
    String name;
    int guess;
    Player(String name){
        this.name = name;
    }
    void makeGuess(){
        this.guess = (int)(Math.random()*9 + 1); //numbers 1-9
        System.out.println(this.name + " guessed " + this.guess);
    }
}
