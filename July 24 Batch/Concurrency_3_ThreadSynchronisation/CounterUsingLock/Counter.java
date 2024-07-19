package Concurrency_3_ThreadSynchronisation.CounterUsingLock;

public class Counter {
    private int count;

    Counter(){
        count = 0;
    }
    void increment(){
        count++;
    }
    void decrement(){
        count--;
    }
    int getCount(){
        return count;
    }
}
