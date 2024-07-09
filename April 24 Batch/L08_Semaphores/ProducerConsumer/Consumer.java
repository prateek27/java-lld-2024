package L08_Semaphores.ProducerConsumer;

import java.util.Queue;

public class Consumer implements Runnable{

    Queue<Object> queue;

    Consumer(Queue<Object> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            synchronized (queue){
                if(queue.size()>0){
                    queue.remove();
                    System.out.println("Bought a T-shirt " + queue.size());
                }
            }
        }
    }
}
