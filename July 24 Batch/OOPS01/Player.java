package OOPS01;

//Encapsulation is hiding the details
// Acess Modifier
public class Player {
    public String name;
    private int guessedNumber;

    public Player(){
    }
    public Player(String name){
        this.name = name;
    }

    void play(){
        System.out.println(name + " is playing!");
    }

    private int getRandomGuess(){
        //100 lines code
        return (int)(Math.random()*9)+1;
    }
    public void guess(){
        //(0 - 8) + 1 = 1-9
        this.guessedNumber = getRandomGuess();
    }
    public int getGuessedNumber(){
        return guessedNumber;
    }
}
