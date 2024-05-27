package L09_Generics;

import L03_OOPS.User;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethodsDemo {

    public static<T> void doSomething(List<T> obj){
        for(T item:obj){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);

        List<String> l2 = new ArrayList<>();
        l2.add("Hello");
        l2.add("Apple");
        l2.add("Guava");
        doSomething(l2);

        List<Object> l3 = new ArrayList<>();
        l3.add(1);
        l3.add("Guava");
        l3.add(new User());

        doSomething(l3);
    }
}
