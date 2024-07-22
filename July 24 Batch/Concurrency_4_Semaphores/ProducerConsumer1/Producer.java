package Concurrency_1_Semaphores.ProducerConsumer1;
import java.util.Queue;
public class Producer implements Runnable {

    Queue<Object> queue;
    int maxCap;

    Producer(Queue queue,int maxCap){
        this.queue = queue;
        this.maxCap = maxCap;
    }

    @Override
    public void run() {
        while(true){
            //each producer makes a tshirt infinitely if there is space in the store
            synchronized (queue){
                if(queue.size()<maxCap){
                    queue.add(new Object());
                    System.out.println("Added a T-Shirt, Size " + queue.size());
                 }
            }
        }
    }
}
