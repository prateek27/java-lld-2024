package Concurrency_1_Threads.BigFactorialCalculator;

import java.math.BigInteger;

public class BigFactorialCalculator {



    public static void main(String[] args) {

       Thread t1 = new Thread(new BigFactorialTask(512));
       Thread t2 = new Thread(new BigFactorialTask(50));
       Thread t3 = new Thread(new BigFactorialTask(5));

       t1.start();
       t2.start();
       t3.start();

       System.out.println("Main is doing some work");

    }
}
