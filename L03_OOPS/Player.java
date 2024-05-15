package L03_OOPS;

public class Player {

    static int count;
    Player(){
        count++;
    }
    int computeScore(){
        return 0;
    }
    int computeScore(int coins){
        return 5*coins;
    }

    int computeScore(int coins,int rank){
        return rank*coins + 100;
    }

    String computeScore(String a,int b){
        return a + b;
    }

    static int getCount(){
        return count;
    }
}
