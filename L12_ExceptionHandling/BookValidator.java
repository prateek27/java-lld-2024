package L12_ExceptionHandling;

public class BookValidator {
    static void validate(String bookname) throws InvalidBookNameException {
        if(!bookname.startsWith("Scaler")){
            throw new InvalidBookNameException("Bookname doesn't start with Scaler!");
        }
        else{
            System.out.println("Book name validated!");
        }
    }

    public static void main(String[] args) {
        try{
            validate("Scaler Python");
            validate("JavaScalerJava");

        }
        catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }
        finally {
            // Shutdown resources, DB connection close etc.
            System.out.println("Closing DB connection!");

        }
        System.out.println("End of app!");
    }
}
