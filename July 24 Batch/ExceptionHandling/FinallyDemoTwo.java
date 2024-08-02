package ExceptionHandling;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FinallyDemoTwo {

    public static int getNumber(int a,int b){

        Lock lock = new ReentrantLock();
        try{
            lock.lock();
            System.out.println("Inside Critical Section");
            return a/b;

        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            try{
                System.out.println("Exiting Critical Section");
                //throw new Exception("Critical Section Exit failed");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            lock.unlock();
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getNumber(10,2));
    }


}
