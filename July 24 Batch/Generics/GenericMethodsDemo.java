package Generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethodsDemo {

    public static <T,U> void sortArray(T[] arr, U[] arr2){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    //Restrict only to numbers (Number or its subtype)

    public static <T extends Number> T incrementNumber(T number) {
        if (number instanceof Integer) {
            return (T) Integer.valueOf(number.intValue() + 1);
        } else if (number instanceof Double) {
            return (T) Double.valueOf(number.doubleValue() + 1);
        } else if (number instanceof Long) {
            return (T) Long.valueOf(number.longValue() + 1);
        } else if (number instanceof Float) {
            return (T) Float.valueOf(number.floatValue() + 1);
        } else if (number instanceof Short) {
            return (T) Short.valueOf((short) (number.shortValue() + 1));
        } else if (number instanceof Byte) {
            return (T) Byte.valueOf((byte) (number.byteValue() + 1));
        } else {
            throw new IllegalArgumentException("Type not supported");
        }
    }
    public static <T extends Number> void incrementNumbers(T[] numbers){
        System.out.println(Arrays.toString(numbers));
    }
    public static <T> void printList1(List<T> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }
    public static void printList2(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        //Numbers
        incrementNumber(5); //valid
        incrementNumber(5.5); //valid
        Integer[] arr = {1,2,3,4,5};
        String[] sarr = {"hello","bye","world"};
        incrementNumbers(arr);

        printList1(List.of(1,2,"hi",3,4));
        printList2(List.of("hello",1,2,5.4));
        //incrementNumbers(sarr);
        //incrementNumber("hello"); //Invalid


        sortArray(arr,arr);

        sortArray(sarr,arr);
    }
}
