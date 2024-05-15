package L03_OOPS;

public class User {
    protected String name;
    protected String email;

    public User(){
        System.out.println("Creating a User");
    }

    public User(String name,String email){
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
}
