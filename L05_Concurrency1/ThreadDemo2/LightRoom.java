package L05_Concurrency1.ThreadDemo2;

public class LightRoom {
    public static void main(String[] args) {
        System.out.println("I am the main thread");
        //Creating a new thread
        Thread imgProcessorThread = new Thread(new ProcessImage());
        Thread imgUploaderThread = new Thread(new UploadPhotos());

        imgProcessorThread.start();
        imgUploaderThread.start();

        System.out.println("Doing some work in main thread");

    }
}
