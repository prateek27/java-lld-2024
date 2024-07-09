package L10_Collections;

import L03_OOPS.Player;
import L03_OOPS.User;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashmapUserDemo {
    public static void main(String[] args) {
        HashMap<User,String> map = new LinkedHashMap<>(); //HW: Demo on LinkedHashset

        User u1 = new User("Prateek","prateek@scaler.com");
        User u2 = new User("Mayank","mayank.com");
        User u3 = new User("PrateekNarang","prateek@gmail.com");

        map.put(u1,"instructor");
        map.put(u2,"student");
        map.put(u3,"instructor");

        Iterator<Map.Entry<User, String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
