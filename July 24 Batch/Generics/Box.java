package Generics;

public class Box {
    Object x;
    Object y;

    Box(Object x,Object y){
        this.x = x;
        this.y = y;
    }

    Object getX(){
        return x;
    }
    Object getY(){
        return y;
    }

    @Override
    public String toString() {
        return "Box{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
