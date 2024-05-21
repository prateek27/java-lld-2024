package L06_Executors.Callable;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        AdderTask a1 = new AdderTask(5,6);
        AdderTask a2 = new AdderTask(100,200);

        Future<Integer> result1  = executor.submit(a1);
        Future<Integer> result2 = executor.submit(a2);

        System.out.println(result1.get()+","+result2.get()); //blocking call
        //shutdown the executor
        executor.shutdown();
    }
}
