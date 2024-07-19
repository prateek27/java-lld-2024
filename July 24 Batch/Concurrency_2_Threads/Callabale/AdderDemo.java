package Concurrency_2_Threads.Callabale;

import Concurrency_1_Threads.BigFactorialCalculator.BigFactorialTask;

import java.util.concurrent.*;

public class AdderDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();

        Future<Integer> output  = executor.submit(new AdderTask(5,3)); //Non-Blocking
        System.out.println("Main is doing some work");
        executor.submit(new BigFactorialTask(500));

        //Result
        System.out.println(output.get()); //Blocking, wait till you don't get an output



    }
}
