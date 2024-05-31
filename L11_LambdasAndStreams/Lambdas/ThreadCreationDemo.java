package L11_LambdasAndStreams.Lambdas;

public class ThreadCreationDemo {
    public static void main(String[] args) {
        Runnable r = new Task();
        Thread t = new Thread(r);
        t.start();

        Runnable lr = () -> {
            System.out.println("Clicking photos!");
            System.out.println("Making reels!");
        };

        Thread t2 = new Thread(lr);
        t2.start();
    }
}
