package L02_OOPSII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeepCopyExample {
    int data;
    List<Integer> list;
    public DeepCopyExample(int data,List<Integer> list){
        this.data = data;
        this.list = new ArrayList<>(list); //deep copy
    }

    @Override
    public String toString() {
        return "ShallowCopyExample{" +
                "data=" + data +
                ", list=" + list +
                '}';
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,5));
        DeepCopyExample deepCopyExample = new DeepCopyExample(5,list);

        list.add(7);
        System.out.println(list);
        System.out.println(deepCopyExample);
    }

}
