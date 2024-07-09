package L07_Synchronisation.AtomicDatatypes;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);
        // make this code multithreaded, no explicit synchronisation mechanisms are needed
        Thread t1 = new Thread(new Adder(counter));
        Thread t2 = new Thread(new Subtracter(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.get());
        //Read about atomic datatypes (HW)

    }
}
