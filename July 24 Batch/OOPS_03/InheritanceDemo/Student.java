package OOPS_03.InheritanceDemo;

public class Student extends User {
    private String batchName;

    Student(String name,String email, String batchName){
        super(name,email); //must be the first line
        this.batchName = batchName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "batchName='" + batchName + '\'' +
                ", name='" + super.getName() + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
