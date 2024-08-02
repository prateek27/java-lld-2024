package Generics;

public class BoxThree<T,U> {
    T first;
    U second;

    BoxThree(T first,U second){
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
        return "BoxThree{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
