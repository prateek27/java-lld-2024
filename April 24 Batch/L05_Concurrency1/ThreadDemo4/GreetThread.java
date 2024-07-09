package L05_Concurrency1.ThreadDemo4;

public class GreetThread extends Thread{
    //extending the threading class
    public void run(){
        //not a recommeded way,because you can't extend any other class this way
        System.out.println("Hello from Greet Thread");
    }
}
