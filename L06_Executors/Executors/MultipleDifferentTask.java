package L06_Executors.Executors;

import L05_Concurrency1.ThreadDemo2.ProcessImage;
import L05_Concurrency1.ThreadDemo3.NumberPrinterTask;
import L05_Concurrency1.ThreadDemo4.GreetThread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MultipleDifferentTask {
    public static void main(String[] args) {
       // Executor executor = Executors.newFixedThreadPool(10);
        Executor executor = Executors.newCachedThreadPool();

        //nature of tasks can be different
        executor.execute(new NumberPrinterTask(77));
        executor.execute(new GreetThread());
        executor.execute(new ProcessImage());
    }
}
