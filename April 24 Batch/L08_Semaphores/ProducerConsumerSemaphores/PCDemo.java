package L08_Semaphores.ProducerConsumerSemaphores;


import L08_Semaphores.SemaphoreDemo.SemaphoreDemo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class PCDemo {
    public static void main(String[] args) {
        Queue<Object> queue = new LinkedList<>();
        final int MAX_CAPACITY = 5;
        Semaphore producerSemaphore = new Semaphore(MAX_CAPACITY);
        Semaphore consumerSemaphore = new Semaphore(0);

        Thread p1 = new Thread(new Producer(queue,MAX_CAPACITY,producerSemaphore,consumerSemaphore));
        Thread p2 = new Thread(new Producer(queue,MAX_CAPACITY,producerSemaphore,consumerSemaphore));
        Thread p3 = new Thread(new Producer(queue,MAX_CAPACITY,producerSemaphore,consumerSemaphore));
        Thread p4 = new Thread(new Producer(queue,MAX_CAPACITY,producerSemaphore,consumerSemaphore));

        Thread c1 = new Thread(new Consumer(queue,producerSemaphore,consumerSemaphore));
        Thread c2 = new Thread(new Consumer(queue,producerSemaphore,consumerSemaphore));
        Thread c3 = new Thread(new Consumer(queue, producerSemaphore,consumerSemaphore));

        //are launched in parallel
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        c1.start(); //q is empty
        c2.start();
        c3.start();

        // 2 tshirts,

    }
}
