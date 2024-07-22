package Concurrency_1_Semaphores.ProducerConsumer1;

import java.util.Queue;

public class Consumer implements Runnable {

    Queue<Object> queue;
    int maxCap;

    Consumer(Queue queue,int maxCap){
        this.queue = queue;
        this.maxCap = maxCap;
    }


    @Override
    public void run() {
        while(true){
            //each consumer buys a tshirt if it is available in the store
            synchronized (queue){
                if(queue.size()>0){
                    queue.remove(); //Underflow
                    System.out.println("Bought a T-Shirt, Size " + queue.size());
                 }
            }
        }
    }
}