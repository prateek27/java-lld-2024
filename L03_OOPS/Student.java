package L03_OOPS;

public class Student extends User{

    String batchName;

    public Student(){
        System.out.println("Creating Student");
    }

    public Student(String name,String email,String batchName){
        super(name,email);
        this.batchName = batchName;
    }

    public void fun(){
        System.out.println("Let's have fun!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "batchName='" + batchName + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
