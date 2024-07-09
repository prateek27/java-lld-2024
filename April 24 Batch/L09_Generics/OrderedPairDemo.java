package L09_Generics;

import L03_OOPS.User;

public class OrderedPairDemo {
    public static void main(String[] args) {
        OrderedPair<Integer,String> op= new OrderedPair<>(10,"Hello");
        System.out.println(op.getKey());
        System.out.println(op.getValue());

        //earlier versions of java didn't had the concept of generics
        // to support backward compatibilty, this syntax is still allowed
        OrderedPair op2 = new OrderedPair(10,"Hello");
        System.out.println(op2);

        OrderedPair op3 = new OrderedPair(10,new User());
        System.out.println(op3);

    }
}
