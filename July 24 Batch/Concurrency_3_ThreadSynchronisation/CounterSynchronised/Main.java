package Concurrency_3_ThreadSynchronisation.CounterSynchronised;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread adderThread = new Thread(new Adder(c));
        Thread subtracterThread = new Thread(new Subtracter(c));
        adderThread.start();
        subtracterThread.start();

        //wait for both threads to finish (ask the main to wait until both thread finish)
        adderThread.join();
        subtracterThread.join();


        System.out.println(c.getCount());
    }
}
