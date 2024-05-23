package L08_Semaphores.ProducerConsumerSemaphores;


import L08_Semaphores.SemaphoreDemo.SemaphoreDemo;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    Queue<Object> queue;
    Semaphore ps;
    Semaphore cs;

    Consumer(Queue<Object> queue, Semaphore producerSemaphore,Semaphore consumerSemaphore){
        this.queue = queue;
        ps = producerSemaphore;
        cs = consumerSemaphore;
    }

    @Override
    public void run() {
        while(true){
            try {
                cs.acquire();
                if(queue.size()>0){
                    queue.remove();
                    System.out.println("Bought a T-shirt " + queue.size());
                    ps.release();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
