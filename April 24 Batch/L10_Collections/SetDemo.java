package L10_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>(); //unordered set
        s.add(30);
        s.add(20);
        s.add(50);
        s.add(20);

        Set<Integer> s2 = new TreeSet<>(); //ordered set, sorted by value
        s2.addAll(s);
        System.out.println(s2);

    }
}
