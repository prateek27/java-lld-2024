package ExceptionHandling;

public class ThreadExceptionDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(()->{

            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                System.out.println("Our thread got interrupted by main");
                e.printStackTrace();
            }
        });

        t.start();
        Thread.sleep(2000);
        System.out.println(t.getState());//RUNNABLE or TIMED_WAITING
        t.interrupt();
        System.out.println("Main is also running");


    }
}
