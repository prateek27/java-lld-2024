package OOPS_03.StaticDemo;

public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car("X");
        Car c2 = new Car("Y");
        Car c3 = new Car("Z");

        //- className.staticMemberName
        //- className.staticMethodName()
        System.out.println("Total Cars : " + Car.getCount());
    }
}
