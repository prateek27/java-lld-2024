package Generics;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        //Recommended Way
        HashMap<Integer,String> hm = new HashMap<>();

        //Older version (no generics) //Raw Data Types
        HashMap hm2 = new HashMap<>(); //support backward compatibility

        hm2.put(1,"Hello");
        hm2.put("Dosa",20);

        for(var v:hm2.keySet()){
            //we don't have the correct datatype
            Integer key = (Integer)v;
            System.out.println(key);
        }

        System.out.println(hm2);



    }
}
