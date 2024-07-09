package L02_OOPSII;
import java.util.*;
public class ShallowCopyExample {
    int data;
    List<Integer> list;
    public ShallowCopyExample(int data,List<Integer> list){
        this.data = data;
        this.list = list;
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
        ShallowCopyExample shallowCopyExample = new ShallowCopyExample(5,list);

        list.add(7);
        System.out.println(list);
        System.out.println(shallowCopyExample);

    }

}
