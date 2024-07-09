package L09_Generics;

import java.util.ArrayList;

public class BoxTwo <T,U> {
    T first;
    U second;

    BoxTwo(T first, U second){
        this.first = first;
        this.second = second;
    }

    T getFirst(){
      return first;
    }
    U getSecond(){
        return second;
    }
    @Override
    public String toString() {
        return "BoxTwo{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
