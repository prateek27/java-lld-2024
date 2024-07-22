package Concurrency_1_Semaphores;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    private static Semaphore semaphore = new Semaphore(3);

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            Worker worker = new Worker(i);
            Thread t = new Thread(worker);
            t.start();
        }
    }

    static class Worker implements Runnable{
        private int workerId;

        Worker(int workerId){
            this.workerId = workerId;
        }

        @Override
        public void run() {
            try {
                //Acquire the Permit
                semaphore.acquire();
                System.out.println("Worker " + workerId + " enters the park");
                Thread.sleep(6000);
                //Release the permit
                System.out.println("Worker " + workerId + " exits the park");
                semaphore.release();


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
