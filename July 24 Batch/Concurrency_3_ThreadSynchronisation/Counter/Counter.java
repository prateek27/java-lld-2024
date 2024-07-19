package Concurrency_3_ThreadSynchronisation.Counter;

import OOPS_04.AbstractClassDemo.Pet;

public class Counter {
    private int count;

    Counter(){
        count = 0;
    }
    void increment(){
        count++;
    }
    void decrement(){
        count--;
    }
    int getCount(){
        return count;
    }
}
