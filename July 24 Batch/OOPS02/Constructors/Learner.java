package OOPS02.Constructors;

import java.util.Arrays;

public class Learner {
    String name;
    int age;
    int marks[];

    Learner(){

    }

    Learner(String name,int age){
        this.name = name;
        this.age = age;
        this.marks = new int[3];
    }
    void setMarks(int subjectId,int subjectMarks){
        if(subjectId<3){
            marks[subjectId] = subjectMarks;
        }
    }

    //Copy constructor
    //Shallow copy --> Replaced by Deep Copy
    Learner(Learner other){
        this.name = other.name;
        this.age = other.age;
        //modify this
        // this.marks = other.marks;
        this.marks = new int[3];
        for(int i=0;i<3;i++){
            this.marks[i] = other.marks[i];
        }
    }

    @Override
    public String toString() {
        return "Learner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
