package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    List<String> books;
    //DB Connection

    BookLibrary(){
        books = new ArrayList<>();
    }
    void addBook(String bookName) throws InvalidBookNameException {
        if(!bookName.startsWith("Scaler")){
            //actually throw an exception at this point
            //throw new InvalidBookNameException(bookName + "Book Name doesn't start with Scaler");
            throw new InvalidBookNameException("BookName is Invalid");
        }
        else{
            books.add(bookName);
        }
    }
}
