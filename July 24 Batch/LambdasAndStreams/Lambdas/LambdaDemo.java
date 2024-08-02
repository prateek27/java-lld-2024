package LambdasAndStreams.Lambdas;

public class LambdaDemo {
    public static void main(String[] args) {
        //Way-1
        Thread t = new Thread(new Task());
        t.start();

        //Lambdas can be used to implement "Functional Interfaces", only one abstract method
        Runnable r = ()->{
            System.out.println("Hello World from " + Thread.currentThread().getName());
        };

        Thread t2 = new Thread(r);
        t2.start();

        Thread t3 = new Thread(()->{
            System.out.println("Lets learn lambdas" + Thread.currentThread().getName());
        });
        t3.start();

    }
}
