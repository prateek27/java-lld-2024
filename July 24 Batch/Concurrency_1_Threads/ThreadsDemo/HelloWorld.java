package Concurrency_1_Threads.ThreadsDemo;

public class HelloWorld {
    //Single Threaded
    public static void fun(){
        System.out.println("Inside fun :" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        fun();
        System.out.println("Hello from Main :" + Thread.currentThread().getName());
        Thread.currentThread().setPriority(10);
        System.out.println("Hello from Main :" + Thread.currentThread().getPriority());
    }
}
