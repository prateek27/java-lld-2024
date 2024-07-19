package Concurrency_2_Threads.Callabale;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSortDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newWorkStealingPool();
        List<Integer> arr = new ArrayList<>(); //= new ArrayList<>(List.of(5,3,1,2,6,0));
        for(int i=0;i<=1000;i++){
            arr.add((int)(Math.random()*50));
        }

        Future<List<Integer>> output = executor.submit(new MergeSort(arr,executor));

        //print
        System.out.println(output.get());
        executor.shutdown();
    }
}
