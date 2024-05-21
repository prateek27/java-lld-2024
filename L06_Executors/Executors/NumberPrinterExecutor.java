package L06_Executors.Executors;

import L05_Concurrency1.ThreadDemo3.NumberPrinterTask;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class NumberPrinterExecutor {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(10);

        for(int i=1;i<=100;i++) {
            executor.execute(new NumberPrinterTask(i));
        }
        System.out.println("Main thread is also executing");
    }
}
