package L05_Concurrency1.FactorialThread;

import java.math.BigInteger;

public class Main {
    static BigInteger compute(int n){

            BigInteger result = BigInteger.ONE;
            for(int i=1;i<=n;i++){
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
    }
    public static void main(String[] args) {
        //should be able to compute a large factorial on a separate thread without blocking the main thread
        // System.out.println(compute(521));

    }
}
