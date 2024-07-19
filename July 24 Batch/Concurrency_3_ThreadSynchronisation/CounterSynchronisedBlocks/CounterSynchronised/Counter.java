package Concurrency_3_ThreadSynchronisation.CounterSynchronisedBlocks.CounterSynchronised;
//Can make this class as safe
public class Counter {
    private int count;

    Counter(){
        count = 0;
    }
    void increment(){
        synchronized (this){
            count++;
        }
    }
    void decrement(){
       synchronized(this){
           count--;
       }
    }
    int getCount(){
        return count;
    }
}
