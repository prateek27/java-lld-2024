package L09_Generics;

public class BoxDemo {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box(10,20); //Box holds two integers
        System.out.println(b1);

        Box<String> b2 = new Box("Apple","Guava"); //box hold two strings
        System.out.println(b2);

        //box that can hold one string and one integer
        // box that can hold one animal, and one student


        // chances of making errors at run-time due wrong typecasting
        // String ans = (String)b2.x;
        System.out.println(b1.x);   //Int
        System.out.println(b2.x); // String

    }

}
