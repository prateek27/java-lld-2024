package L04_OOPSIV.InterfaceDemo1;

public class Drone implements Fly{
    @Override
    public void fly() {
        System.out.println("Drone is flying!");
    }

    public void clickPicture(){
        System.out.println("Drone is clicking pics");
    }

}
