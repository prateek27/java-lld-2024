package L02_OOPSII.Game;

import java.util.ArrayList;

public class Game {
    int machineGuess;
    Player p1,p2,p3;

    Game(String name1,String name2, String name3){

        p1 = new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }

    private boolean checkWinner(){
        if(p1.guess == machineGuess){
            System.out.println(p1.name + "Wins");
            return true;
        }
        else if(p2.guess == machineGuess){
            System.out.println(p2.name + "Wins");
            return true;
        }
        else if(p3.guess == machineGuess){
            System.out.println(p3.name + "Wins");
            return true;
        }
        return false;
    }

    void play(){
        //machine guess
        machineGuess = (int)(Math.random()*9 + 1);


        //infnite loop, stop whenever there is a winner
        while(true){
            System.out.println("Machine Guess is " + machineGuess);
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();
            if(checkWinner()){
                System.out.println("Game Over");
                System.out.println();
                return;
            }
            else{
                machineGuess = (int)(Math.random()*9 + 1);
            }
        }
    }
}
