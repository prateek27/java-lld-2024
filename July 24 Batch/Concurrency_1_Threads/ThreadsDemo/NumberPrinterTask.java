package Concurrency_1_Threads.ThreadsDemo;

public class NumberPrinterTask implements Runnable{
    int data;
    NumberPrinterTask(int data){
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("Number :"+data + " " + Thread.currentThread().getName());
    }
}
