package L07_Synchronisation.AtomicDatatypes;

import java.util.concurrent.atomic.AtomicInteger;

public class Adder implements Runnable{
    private AtomicInteger counter;

    Adder(AtomicInteger counter){
        this.counter = counter;
    }


    @Override
    public void run() {
        for(int i=0;i<=1000;i++){
            counter.addAndGet(5);
        }
    }
}
