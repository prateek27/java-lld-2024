package Concurrency_1_Semaphores.ProducerConsumer2;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    Queue<Object> queue;
    int maxCap;
    Semaphore ps,cs;

    Consumer(Queue queue,int maxCap,Semaphore ps,Semaphore cs){
        this.queue = queue;
        this.maxCap = maxCap;
        this.ps = ps;
        this.cs = cs;
    }


    @Override
    public void run() {
        while(true){
            //each consumer buys a tshirt if it is available in the store
            try {

                if(queue.size()>0){
                    cs.acquire();
                    queue.remove(); //Underflow
                    System.out.println("Bought a T-Shirt, Size " + queue.size());
                    ps.release();
                }

            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}