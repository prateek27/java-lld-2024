package L12_ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FinallyDemo {
    static void readFile(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
        // Code to read from the file
    }
    public static void main(String[] args) {
        // Executor //takes lot of resources because of thread pool
        ExecutorService executor = Executors.newFixedThreadPool(10);

        try{
            readFile("myprofile.png");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException();
        }
        finally {
            // Free up critical resources
            System.out.println("This always runs, shutting down the executor!");
            executor.shutdown();
        }

        System.out.println("Next Image processing!");
    }
}
