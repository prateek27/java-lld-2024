package L05_Concurrency1.ThreadDemo2;

public class ProcessImage implements Runnable {

    void brighten(){
        System.out.print("Brightening the image");
    }
    void sharpen(){
        System.out.print("Sharpening the image");
    }

    @Override
    public void run() {
        //business logic for the task should go here
        System.out.println("Processing the image");
        brighten();
        sharpen();
    }
}
