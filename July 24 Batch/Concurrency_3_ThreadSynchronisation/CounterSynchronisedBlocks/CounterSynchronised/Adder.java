package Concurrency_3_ThreadSynchronisation.CounterSynchronisedBlocks.CounterSynchronised;

public class Adder implements Runnable{
    Counter counter;

    Adder(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        //Add to Count
        for(int i=0;i<1000;i++){
                counter.increment();
        }
    }
}
