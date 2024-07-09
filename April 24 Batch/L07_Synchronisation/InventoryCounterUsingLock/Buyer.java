package L07_Synchronisation.InventoryCounterUsingLock;

import java.util.concurrent.locks.Lock;

public class Buyer implements Runnable{
    Counter counter;
    Lock lock;

    Buyer(Counter counter,Lock lock){
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=0;i<100000;i++){
            // Remove 1-Tshirt at time from counter
            lock.lock();
            counter.decrement();
            lock.unlock();
        }
    }
}
