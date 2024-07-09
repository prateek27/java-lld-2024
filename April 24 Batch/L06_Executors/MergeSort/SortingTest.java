package L06_Executors.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SortingTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> l = new ArrayList<>(List.of(7,3,1,2,4,6,17,12));
        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(l,executorService);
        Future<List<Integer>> futureOutput = executorService.submit(sorter);
        //do other things here
        System.out.println(futureOutput.get());
        //shutdown the executor
        executorService.shutdown();
    }
}
