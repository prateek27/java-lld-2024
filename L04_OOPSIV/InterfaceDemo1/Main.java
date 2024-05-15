package L04_OOPSIV.InterfaceDemo1;

public class Main {
    public static void main(String[] args) {
        // bird implement two interfaces
        Bird b = new Bird();
        b.fly();
        b.eat();
        b.transform();


        Drone d = new Drone();
        d.fly();
        d.clickPicture();

        //DJI Drone
        DJIMiniDrone djiMini = new DJIMiniDrone();
        djiMini.fly();

    }
}
