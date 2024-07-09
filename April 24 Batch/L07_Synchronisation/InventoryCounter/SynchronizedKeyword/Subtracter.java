package L07_Synchronisation.InventoryCounter.SynchronizedKeyword;

public class Subtracter implements Runnable {
    Counter counter;
    Subtracter(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0;i<=100000;i++){
            this.counter.decrement();
        }
    }
}