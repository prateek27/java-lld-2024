package Concurrency_2_Threads.Callabale;

import java.util.concurrent.Callable;

public class AdderTask implements Callable<Integer> {

    int a;
    int b;

    AdderTask(int a,int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        return a+b;
    }
}
