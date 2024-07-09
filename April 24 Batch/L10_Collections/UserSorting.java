package L10_Collections;

import L03_OOPS.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserSorting {
    public static void main(String[] args) {
        User u1 = new User("Prateek","prateek@scaler.com");
        User u2 = new User("Mayank","mayank.com");
        User u3 = new User("Prateek","prateek@gmail.com");

        List<User> l = new ArrayList<>();
        l.add(u1);
        l.add(u2);
        l.add(u3);

        Collections.sort(l); //USERS ARE SORTED ACC TO EMAIL ID
        System.out.println(l);
    }
}
