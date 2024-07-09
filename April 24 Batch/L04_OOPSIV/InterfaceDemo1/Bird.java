package L04_OOPSIV.InterfaceDemo1;

public class Bird implements Fly, Transform {
    @Override
    public void fly() {
        System.out.println("Bird is flying!");
    }
    public void eat(){
        System.out.println("Bird is eating");
    }

    public void transform(){
        System.out.println("Bird is getting transformed!");
    }
}
