package Concurrency_1_Threads.ThreadsDemo;

import java.util.ArrayList;
import java.util.List;

public class NumberPrinterApp {
    public static void main(String[] args) {
        //Print Numbers from 1 to 100
        // Print each number using a separate thread (100 threads)
        // Each Thread should know what number to print
        List<Thread> threads = new ArrayList<>();

        //Create
        for(int i=1;i<=100;i++){
            Runnable r = new NumberPrinterTask(i);
            Thread t = new Thread(r);
            t.start();
        }
        //Launch them
        for(Thread t:threads){
            t.start();
        }

    }
}


