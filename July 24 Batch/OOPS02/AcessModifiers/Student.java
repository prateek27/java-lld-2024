package OOPS02.AcessModifiers;

public class Student extends User{
    int marks;
    public Student(String name,String email,int marks){
        super(name,email);
        this.marks = marks;
    }
    public void updateEmail(String email){
        this.email = email; //this.email can be acessed because it is protected
    }
}
