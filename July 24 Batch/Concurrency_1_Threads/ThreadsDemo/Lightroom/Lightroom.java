package Concurrency_1_Threads.ThreadsDemo.Lightroom;

public class Lightroom {

    public static void main(String[] args) {
        System.out.println("Lightroom is running "+Thread.currentThread().getName());
        //Thread Creation
        Thread t1 = new Thread(new ImageProcessTask());
        Thread t2 = new Thread(new SyncPhotosTask());

        //Launch
        t1.start();
        t2.start();

        // Application = Process
        // Application = Many Independent Tasks or Threads

    }
}
