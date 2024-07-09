package L09_Generics;

public class GenericMethodDemo {

    public static<T>  void printArray(T[] arr){
        for(T data:arr){
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4};
        String[] s = {"Apple","Mango","Guava"};

        printArray(arr);
        printArray(s);
    }
}
