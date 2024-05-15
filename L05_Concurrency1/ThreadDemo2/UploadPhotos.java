package L05_Concurrency1.ThreadDemo2;

public class UploadPhotos implements Runnable {
    @Override
    public void run() {
        System.out.println("Uploading photos to cloud!");
    }
}
