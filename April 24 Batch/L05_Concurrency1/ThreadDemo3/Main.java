package L05_Concurrency1.ThreadDemo3;

public class Main {
    public static void main(String[] args) {
        //App - Prints numbers from 1 to 10, but each number should be printed by a separate thread
        for(int i=1;i<=10;i++) {
            Thread t = new Thread(new NumberPrinterTask(i));
            t.start();
        }
        System.out.println("Main thread is also executing");
    }
}
