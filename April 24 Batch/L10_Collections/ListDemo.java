package L10_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void printList(List<Integer> l){
        for(int x:l){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        List<Integer> myList2 = new LinkedList<>();
        myList2.add(11);
        myList2.add(12);
        myList2.add(13);
        myList2.addAll(myList);
        //printList(myList2);

        Iterator<Integer> iterator = myList2.iterator();
        while(iterator.hasNext()){
            Integer element = iterator.next();
            System.out.println(element);
        }
    }
}
