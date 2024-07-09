package Game;

public class Game {
    private int gameGuess;
    Player p1,p2,p3;

    public Game(String n1,String n2,String n3){
        p1 = new Player(n1);
        p2 = new Player(n2);
        p3 = new Player(n3);
    }
    private void updateGuess(){
        this.gameGuess = (int)(Math.random()*9) + 1;
        System.out.println("Game guessed : "+this.gameGuess);
    }

    boolean isWinner(){
        //matching
        boolean isWinner = false;
        if(p1.getGuess()==gameGuess){
            System.out.println(p1.name + " Wins");
            isWinner = true;
        }
        if(p2.getGuess()==gameGuess){
            System.out.println(p2.name + " Wins");
            isWinner = true;
        }
        if(p3.getGuess()==gameGuess){
            System.out.println(p3.name +" Wins");
            isWinner = true;
        }

        return isWinner;
    }

    public void start(){

        while(true){
            updateGuess();
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();
            if(isWinner()){
                System.out.println("Game over");
                break;
            }
        }
    }
}
