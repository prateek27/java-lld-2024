package Concurrency_3_ThreadSynchronisation.AtomicCounter.Counter;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger count;

    Counter(){
        count = new AtomicInteger(0);
    }
    void increment(){
        count.addAndGet(1);
    }
    void decrement(){
        count.addAndGet(-1);
    }
    int getCount(){
        return count.get();
    }
}
