package Concurrency_3_ThreadSynchronisation.AtomicCounter.Counter;

public class Subtracter implements Runnable{
    Counter counter;

    Subtracter(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        //Add to Count
        for(int i=0;i<1000;i++){
            counter.decrement();
        }
    }
}