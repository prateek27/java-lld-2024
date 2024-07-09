package OOPS02.Constructors;

public class LearnerDemo {
    public static void main(String[] args) {
        Learner learner1 = new Learner("Sanjana",24);
        learner1.setMarks(0,10);
        learner1.setMarks(1,12);
        learner1.setMarks(2,20);

        Learner learner2 = new Learner(learner1);

        learner2.name = "Sanjana-2.0";
        learner2.age = 22;
        learner2.setMarks(0,50);

        System.out.println(learner1);
        System.out.println(learner2);





    }
}
