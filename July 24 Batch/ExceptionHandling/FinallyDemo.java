package ExceptionHandling;

public class FinallyDemo {
    public static void main(String[] args) {
        try{
            System.out.println("inside try block");
            int result = 10/5;
            System.out.println("Result " + result);

        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Inside finally block");
        }
        System.out.println("Main is running!");
    }

}
