package Concurrency_3_ThreadSynchronisation.CounterUsingLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Lock lock = new ReentrantLock();

        Thread adderThread = new Thread(new Adder(c,lock));
        Thread subtracterThread = new Thread(new Subtracter(c,lock));
        adderThread.start();
        subtracterThread.start();

        //wait for both threads to finish (ask the main to wait until both thread finish)
        adderThread.join();
        subtracterThread.join();


        System.out.println(c.getCount());
    }
}
