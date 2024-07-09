package OOPS02.AcessModifiers;

public class UserDemo {

    static void play(){
        //you wont be able to create an object
        // because the default constructor is now missing
        User u = new User();
        System.out.println("Playing with user");
    }

    public static void main(String[] args) {

        //Creating Objects
        User u1 = new User("Karthik","kartik@gmail.com");
        User u2 = new User("Rohan","rohan@gmail.com");

        //Printing Objects
        System.out.println(u1);
        System.out.println(u2);
    }
}
