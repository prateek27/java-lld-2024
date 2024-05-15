package L05_Concurrency1.ThreadDemo3;

public class NumberPrinterTask implements Runnable {
    int number;
    NumberPrinterTask(int n){
        this.number = n;
    }
    @Override
    public void run() {
        System.out.println("number " + number);
    }
}
