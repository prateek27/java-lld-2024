package L08_Semaphores.ProducerConsumerSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Queue<Object> queue;
    int maxCap;
    Semaphore ps;
    Semaphore cs;

    Producer(Queue<Object> queue, int maxCap, Semaphore producerSemaphore, Semaphore consumerSemaphore){
        this.queue = queue;
        this.maxCap = maxCap;
        ps = producerSemaphore;
        cs = consumerSemaphore;
    }

    @Override
    public void run() {
        while(true){
            try {
                ps.acquire();
                if(queue.size()<maxCap){
                    queue.add(new Object());
                    System.out.println("Added a T-shirt " + queue.size());
                    cs.release();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
