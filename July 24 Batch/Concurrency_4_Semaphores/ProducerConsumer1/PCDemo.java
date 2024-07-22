package Concurrency_1_Semaphores.ProducerConsumer1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PCDemo {
    public static void main(String[] args) {
        Queue<Object> queue = new LinkedList<>();
        final int MAX_CAP = 5;

        ArrayList<Thread> threads = new ArrayList<>();
        //6 Producer Threads
        for(int i=0;i<=5;i++){
            threads.add(new Thread(new Producer(queue,MAX_CAP)));
        }

        //4 Consumer Threads
        for(int i=0;i<=3;i++){
            threads.add(new Thread(new Consumer(queue,MAX_CAP)));
        }

        //Launch 10 threads
        for(Thread t:threads){
            t.start();
        }
    }
}
