package ExceptionHandling;

public class InvalidBookNameException extends RuntimeException{
    public InvalidBookNameException(String msg){
        super(msg);
    }
}
