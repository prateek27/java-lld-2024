package Concurrency_2_Threads.Callabale;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {
    List<Integer> arr;
    ExecutorService executor;

    MergeSort(List<Integer> arr,ExecutorService executor){
        this.arr = arr;
        this.executor = executor; //one shared object
    }

    @Override
    public List<Integer> call() throws Exception {
        //base case
        if(arr.size()<=1){
            return arr;
        }


        //Rec Case
        int mid = (arr.size())/2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        //Copy Data (Two Subarrays)
        for(int i=0;i<mid;i++){
            left.add(arr.get(i));
        }
        for(int i=mid;i<arr.size();i++){
            right.add(arr.get(i));
        }
        //Sort the two parts
        //Submit the task of left sorting
        // Submit the task of right sorting

        Future<List<Integer>> leftFuture = executor.submit(new MergeSort(left,executor));
        Future<List<Integer>> rightFuture = executor.submit(new MergeSort(right,executor));

        //wait
        left = leftFuture.get();
        right = rightFuture.get();

        //Merge
        List<Integer> output = new ArrayList<>();
        int i=0,j=0;
        while(i<left.size() && j<right.size()){
            if(left.get(i)<right.get(j)){
                output.add(left.get(i));
                i++;
            }
            else{
                output.add(right.get(j));
                j++;
            }
        }
        //one of the array might have remaining elemnts
        while(i<left.size()){
            output.add(left.get(i));
            i++;
        }
        while(j<right.size()){
            output.add(right.get(j));
            j++;
        }
        System.out.println("Output "+output + Thread.currentThread().getName());
        return output;


    }
}
