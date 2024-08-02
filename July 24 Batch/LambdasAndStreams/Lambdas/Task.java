package LambdasAndStreams.Lambdas;

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello I am doing a Task!" + Thread.currentThread().getName());
    }
}

