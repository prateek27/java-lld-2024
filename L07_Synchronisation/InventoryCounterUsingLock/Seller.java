package L07_Synchronisation.InventoryCounterUsingLock;

import java.util.concurrent.locks.Lock;

public class Seller implements Runnable{
    Counter counter;
    Lock lock;

    Seller(Counter counter,Lock lock){
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=0;i<100000;i++){
            //Add 1 t-shirts to the shared Counter
            lock.lock();
            counter.count++;
            lock.unlock();
        }
    }
}
