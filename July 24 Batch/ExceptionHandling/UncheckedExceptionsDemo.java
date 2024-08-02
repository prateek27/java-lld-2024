package ExceptionHandling;

public class UncheckedExceptionsDemo {
    //Unchecked during the compile time
    public static void divide(int a,int b){
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            // System.out.println("Dividing by zero");
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        divide(10,0);
        System.out.println("I am doing something!");
    }
}
