package ExceptionHandling;

import java.awt.print.Book;

public class BookLibraryDemo {
    public static void main(String[] args)  {
        //RunTime Exception (you may handle it but compiler will let you compile the code)
        BookLibrary library = new BookLibrary();
        library.addBook("JavaByScaler");

        //trywithresources (modern alternative for finalise)
    }
}
