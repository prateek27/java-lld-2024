package Concurrency_3_ThreadSynchronisation.CounterUsingLock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Counter counter;
    Lock lock;

    Adder(Counter counter,Lock lock){
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        //Add to Count

        for(int i=0;i<1000;i++){
            lock.lock();
            counter.increment();
            lock.unlock();
        }
    }
}
