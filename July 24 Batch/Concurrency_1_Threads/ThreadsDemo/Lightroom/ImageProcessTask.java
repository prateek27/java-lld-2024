package Concurrency_1_Threads.ThreadsDemo.Lightroom;

public class ImageProcessTask implements Runnable{
    public void denoise(){
        System.out.println("Denoise the image :" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        //enclose the business logic here
        System.out.println("Processing the image: " + Thread.currentThread().getName());
        denoise();
    }
}
