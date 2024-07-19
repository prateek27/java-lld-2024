package Concurrency_3_ThreadSynchronisation.CounterSynchronised;
//Can make this class as safe
public class Counter {
    private int count;

    Counter(){
        count = 0;
    }
    synchronized void increment(){
        count++;
    }
    synchronized void decrement(){
        count--;
    }
    int getCount(){
        return count;
    }
}
