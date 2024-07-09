package OOPS02.AcessModifiers;

public class User {
    private String name;
    protected String email;

    public User(){

    }
    //Parameterised Constructor
    public User(String name){
        this.name = name;
    }
    public User(String name,String email){
        this.name = name;
        setEmail(email);
    }


    //internal method of the class
    private boolean isValidEmail(String email){
        return email.endsWith("@gmail.com")||email.endsWith("@yahoo.com");
    }

    //Setter Function
    public void setEmail(String email){
        if(isValidEmail(email)){
            this.email = email;
        }
        else{
            this.email = null;
        }
    }
    public String getEmail(){
        return email;
    }

    //Getter Function
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
