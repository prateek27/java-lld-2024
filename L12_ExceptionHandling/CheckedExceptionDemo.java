package L12_ExceptionHandling;

public class CheckedExceptionDemo {
    public static void main(String[] args) {

        Thread t = new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName() + " is running");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "got interrupted!");
            }
        });

        t.start();
        t.interrupt();
        System.out.println(Thread.currentThread().getName() + " is running");

    }
}
