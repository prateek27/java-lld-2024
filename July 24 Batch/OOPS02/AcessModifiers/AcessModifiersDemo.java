package OOPS02.AcessModifiers;

import OOPS01.Player;

public class AcessModifiersDemo {
    public static void main(String[] args) {
        //Default-Access
        User user = new User("Rahul","rahul@yaho.com");
        System.out.println(user.getName());


        user.setEmail("xyz@yahoo.com");
        System.out.println(user);

        System.out.println(user.getEmail());

        //Default-Acess
        Player player = new Player("Rohan");
        System.out.println(player.name);
        player.guess();
        System.out.println(player.getGuessedNumber());

    }
}
