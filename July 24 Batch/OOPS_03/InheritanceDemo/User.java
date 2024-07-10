package OOPS_03.InheritanceDemo;

public class User extends Person {
    private String name;
    protected String email;

    public User(String name,String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public String getName(){
        return this.name;
    }
}
