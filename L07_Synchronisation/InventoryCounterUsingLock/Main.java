package L07_Synchronisation.InventoryCounterUsingLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Lock lock = new ReentrantLock();

        System.out.println(counter.getCount());
        //Create Threads
        Thread sellerThread = new Thread(new Seller(counter,lock));
        Thread buyerThread = new Thread(new Buyer(counter,lock));

        //Start Threads
        sellerThread.start();
        buyerThread.start();

        //Join (Means Main will have for both seller and buyer to finish execution before call counter.getCount()
        sellerThread.join();
        buyerThread.join();

        System.out.println(counter.getCount()); //1L or less than 1Lac
    }
}
