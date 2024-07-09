package L02_OOPSII;

import java.util.Arrays;

public class Test {
    public int n;
    String name;
    int arr[];

    Test(int n,String name){
        this.n = n;
        this.name = name;
        this.arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i + 1;
        }
    }

    Test(Test obj){
        this.n = obj.n;
        this.name = obj.name;
        this.arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = obj.arr[i];
        }
    }

    @Override
    public String toString() {
        return "Test{" +
                "n=" + n +
                ", name='" + name + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
