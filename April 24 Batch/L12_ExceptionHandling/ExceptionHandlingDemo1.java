package L12_ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingDemo1 {

    public static void divide(int a,int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {

        try{
            divide(10,0);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


        int arr[] = new int[10];
        //init
        for(int i=0;i<10;i++){
            arr[i] = i*i;
        }
        //ask the user for an index
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();

        //print the element at that index
        try{
            System.out.println(arr[idx]);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



        System.out.println("This always runs!");
    }
}
