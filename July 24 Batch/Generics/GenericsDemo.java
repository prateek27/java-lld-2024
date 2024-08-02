package Generics;

import Collections.Building;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    //WildCard
    public static void printList(List<?> list){
        if(!list.isEmpty() && list.get(0) instanceof String){
            for (Object element : list) {
                String str = (String)element;
                System.out.println(str +" " +str.length());
            }
        }
        else if(!list.isEmpty() && list.get(0) instanceof Integer){
            for (Object element : list) {
                Integer no = (Integer) element;
                System.out.println(no +" " +no*no);
            }
        }
    }
    //Generic Template
    public static <T> void printListG(List<T> list) {

        if(!list.isEmpty() && list.get(0) instanceof String){
            for (T element : list) {
                String str = (String)element;
                System.out.println(str +" " +str.length());
            }
        }
        else if(!list.isEmpty() && list.get(0) instanceof Integer){
            for (T element : list) {
                Integer no = (Integer) element;
                System.out.println(no +" " +no*no);
            }
        }

    }



    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1,2,3));
        printList(arr);
        printListG(arr);
        List<String> sarr = new ArrayList<>(List.of("One","Two","Three"));
        printList(sarr);
        printListG(sarr);


        //Heteregeous list
        List<Object> myList = new ArrayList<>();
        myList.add(1);
        myList.add("Hello");

        for(Object o:myList){
            System.out.println(o);
        }

        /*
        printList(myList);
        printListG(myList);
         */


    }
}
