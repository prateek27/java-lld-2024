package Concurrency_1_Threads.ThreadsDemo.Lightroom;

public class SyncPhotosTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Syncing photos to cloud :" + Thread.currentThread().getName());
    }
}
