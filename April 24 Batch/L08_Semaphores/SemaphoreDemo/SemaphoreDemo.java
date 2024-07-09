package L08_Semaphores.SemaphoreDemo;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    private static Semaphore semaphore = new Semaphore(3); //3 is max permits available


    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Thread worker = new Thread(new Worker(i));
            worker.start();
        }
    }

    static class Worker implements Runnable{

        private final int workerId;

        Worker(int id){
            workerId = id;
        }

        @Override
        public void run() {
            //does some work for 2 s
            System.out.println("Worker " + workerId + " is waiting for permit");
            try {
                semaphore.acquire(); //get a permit or else wait
                System.out.println("Worker " + workerId + " enters the Park");
                Thread.sleep(30000);
                //exiting the park
                System.out.println("Worker " + workerId + " is out of the park");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
