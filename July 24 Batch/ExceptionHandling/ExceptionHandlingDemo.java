package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingDemo {
    static void readFromFile(String filename) throws FileNotFoundException {
        //Checked Exception - we must handle before compiling the code
        FileReader fileReader = new FileReader(filename);
        //do something
    }

    public static void main(String[] args) {
        try {
            readFromFile("abc.txt");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Please enter a valid filename");
        }
        System.out.println("I am doing something");
    }
}
