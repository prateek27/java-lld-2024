package L12_ExceptionHandling;

public class InvalidBookNameException extends Exception {
    public InvalidBookNameException(String msg){
        super(msg); //calling the constructor of parent class
    }
    //add other methods!
}
