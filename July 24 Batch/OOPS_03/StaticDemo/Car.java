package OOPS_03.StaticDemo;

public class Car {
    String name;
    private static int count=0;

    Car(String name){
        this.name = name;
        count++;
    }

    //static methods don't know any specific to the objects
    // hence you should never use any non-static member/method from a static method
    public static int getCount(){
        return count;
    }
}
