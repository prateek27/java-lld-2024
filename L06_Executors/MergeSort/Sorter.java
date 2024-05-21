package L06_Executors.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arr;
    ExecutorService executorService;

    Sorter(List<Integer> arr,ExecutorService executorService){
        this.arr = arr;
        this.executorService = executorService;
    }


    @Override
    public List<Integer> call() throws Exception {


        //base case
        if(arr.size()<=1){
            return arr;
        }
        //Print the current thread
        System.out.println(Thread.currentThread().getName());

        //recursive
        //merge sort logic
        int mid = (arr.size())/2;
        //two separate arrays for left and right
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int i=0;i<mid;i++){
            left.add(arr.get(i));
        }

        for(int i=mid; i<arr.size();i++){
            right.add(arr.get(i));
        }

        //Sort the Left and Right Array by creating a separate task
        // give this task to the executor framework


        Future<List<Integer>> leftSortedFuture = executorService.submit(new Sorter(left,executorService));
        Future<List<Integer>> rightSortedFuture = executorService.submit(new Sorter(right,executorService));

        // merge
        // we wait for the output before doing a merge
        left = leftSortedFuture.get();
        right = rightSortedFuture.get();

        //now here you can merge code
        //just like the merge
        List<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<left.size() && j<right.size()){
            if(left.get(i)<right.get(j)){
                ans.add(left.get(i));
                i++;
            }
            else{
                ans.add(right.get(j));
                j++;
            }
        }
        //some elements might have been left in one of the array
        while(i<left.size()){
            ans.add(left.get(i));
            i++;
        }
        while(j<right.size()){
            ans.add(right.get(j));
            j++;
        }
        return ans;
    }
}
