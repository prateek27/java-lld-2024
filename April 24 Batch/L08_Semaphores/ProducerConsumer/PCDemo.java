package L08_Semaphores.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class PCDemo {
    public static void main(String[] args) {
        Queue<Object> queue = new LinkedList<>();
        final int MAX_CAPACITY = 5;

        Thread p1 = new Thread(new Producer(queue,MAX_CAPACITY));
        Thread p2 = new Thread(new Producer(queue,MAX_CAPACITY));
        Thread p3 = new Thread(new Producer(queue,MAX_CAPACITY));
        Thread p4 = new Thread(new Producer(queue,MAX_CAPACITY));

        Thread c1 = new Thread(new Consumer(queue));
        Thread c2 = new Thread(new Consumer(queue));
        Thread c3 = new Thread(new Consumer(queue));

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
