package OOPS_03.InheritanceDemo;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Rahul","rahul@gmail.com");
        User u2 = new User("Akhil","akhil@yahoo.com");
        Student s = new Student("Sanjana","sanjana@gmail.com","SQL July Batch");
        Instructor i = new Instructor("Prateek","pn@gmail.com",10);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(s);
        System.out.println(i);

        System.out.println(s.country);
        System.out.println(i.country);
    }
}
