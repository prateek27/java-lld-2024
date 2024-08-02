package ExceptionHandling;

import java.util.Scanner;

public class ArrayIndexException {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int idx;
        Scanner sc = new Scanner(System.in);
        idx = sc.nextInt();
        if(idx<arr.length) {
            System.out.println(arr[idx]);
        }
    }
}
