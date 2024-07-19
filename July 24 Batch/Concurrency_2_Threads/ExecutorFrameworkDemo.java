package Concurrency_2_Threads;

import Concurrency_1_Threads.BigFactorialCalculator.BigFactorialTask;
import Concurrency_1_Threads.ThreadsDemo.Lightroom.ImageProcessTask;
import Concurrency_1_Threads.ThreadsDemo.Lightroom.SyncPhotosTask;
import Concurrency_1_Threads.ThreadsDemo.NumberPrinterTask;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo {
    public static void main(String[] args) {
        //ExecutorService executor = Executors.newFixedThreadPool(10);
       //ExecutorService executor = Executors.newCachedThreadPool();
       //ExecutorService executor = Executors.newSingleThreadExecutor();
       ExecutorService executor = Executors.newWorkStealingPool();

        executor.submit(new ImageProcessTask());
        executor.submit(new NumberPrinterTask(5));
        executor.submit(new SyncPhotosTask());

        //Reuse the threads
        for(int i=0;i<=100;i++){
            executor.submit(new NumberPrinterTask(i));
        }

        //wait till the tasks are to finished (safe to use, gracefully shutdown)
        executor.shutdown();

        //doing some work
        int arr[] = new int[100000];

    }
}
