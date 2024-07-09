package OOPS02.AcessModifiers;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student("Rahul","rahul@yahoo.com",70);
        s.email = "xyz.com";
        System.out.println(s.email);
    }
}
