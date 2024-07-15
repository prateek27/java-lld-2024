package Concurrency_1_Threads.BigFactorialCalculator;

import java.math.BigInteger;

public class BigFactorialTask implements Runnable{
    int number;

    BigFactorialTask(int number){
        this.number = number;
    }
    public static void compute(int number){
        BigInteger result = new BigInteger("1");
        for(int i=1;i<=number;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }


    @Override
    public void run() {
        compute(number);
    }
}
