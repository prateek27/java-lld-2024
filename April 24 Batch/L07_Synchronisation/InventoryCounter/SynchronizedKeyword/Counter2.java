package L07_Synchronisation.InventoryCounter.SynchronizedKeyword;

import java.util.concurrent.locks.ReentrantLock;

public class Counter2 implements Counter{
    private int count;
    private ReentrantLock lock;

    Counter2(){
        count = 0;
        lock = new ReentrantLock();

    }

    public void increment(){
        lock.lock();
        count++;
        lock.unlock();
    }
    public void decrement(){
        lock.lock();
        count--;
        lock.unlock();
    }
    public int getCount(){
        return count;
    }
}
