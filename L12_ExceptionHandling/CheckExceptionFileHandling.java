package L12_ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckExceptionFileHandling {
    static void readFile(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);

        // Code to read from the file
    }

    public static void main(String[] args) {
        try{
            readFile("abc_scaler.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("issue while reading file!" + e.getMessage());
            System.out.println(e.getClass());
        }
        System.out.println("This is running");
    }
}
