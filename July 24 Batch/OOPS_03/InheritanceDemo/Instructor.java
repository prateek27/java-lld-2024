package OOPS_03.InheritanceDemo;

public class Instructor extends User{

    int salary;
    public Instructor(String name, String email,int salary) {
        super(name, email);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name= " + super.getName() +
                "salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
}
