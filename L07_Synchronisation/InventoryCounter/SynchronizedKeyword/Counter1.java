package L07_Synchronisation.InventoryCounter.SynchronizedKeyword;

public class Counter1 implements Counter {
    private int count;

    public synchronized void increment(){
        count++;

    }
    public synchronized void decrement(){
        count--;
    }
    public synchronized int getCount(){
        return count;
    }
}
