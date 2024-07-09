package L07_Synchronisation.InventoryCounter.SynchronizedKeyword;
import java.util.concurrent.locks.ReentrantLock;

public class Counter3 implements Counter{
    private int count;
    private ReentrantLock lock;

    Counter3(){
        count = 0;
        lock = new ReentrantLock();

    }

    public void increment(){

        synchronized(this) {
            count++;
        }
    }
    public void decrement(){

        synchronized(this) {
            count--;
        }
    }
    public int getCount(){
        return count;
    }
}
