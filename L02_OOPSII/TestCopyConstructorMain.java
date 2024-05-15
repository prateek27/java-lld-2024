package L02_OOPSII;

public class TestCopyConstructorMain {
    public static void main(String[] args) {
        Test t1 = new Test(5,"Maths");


        Test t2 = new Test(t1);
        t2.n = 6;
        t2.name = "Physics";

        t2.arr[0] = 80;

        System.out.println(t1);
        System.out.println(t2);

    }
}
