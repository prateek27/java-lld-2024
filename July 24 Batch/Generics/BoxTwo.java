package Generics;

public class BoxTwo<T> {
    T x;
    T y;

    BoxTwo(T x,T y){
        this.x = x;
        this.y = y;
    }
    T getX(){
        return this.x;
    }

    @Override
    public String toString() {
        return "BoxTwo{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
