package Concurrency_1_Semaphores.ProducerConsumer2;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    Queue<Object> queue;
    int maxCap;
    Semaphore ps,cs;

    Producer(Queue queue,int maxCap,Semaphore ps,Semaphore cs){
        this.queue = queue;
        this.maxCap = maxCap;
        this.ps = ps;
        this.cs = cs;
    }

    @Override
    public void run() {
        while(true){
            //each producer makes a tshirt infinitely if there is space in the store
            try {
                ps.acquire();
                if(queue.size()<maxCap){
                    queue.add(new Object());
                    System.out.println("Added a T-Shirt, Size " + queue.size());
                    cs.release();
                }
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
