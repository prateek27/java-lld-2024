package L09_Generics;

public class Box<T> {
    //two items
    T x;
    T y;

    Box(T x,T y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Box{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
