package L05_Concurrency1.ThreadDemo4;

public class Main {
    public static void main(String[] args) {
        Thread t = new GreetThread();
        t.start();
        System.out.println("Hello from main thread");
    }
}
