import Command_Processor.BookController;
import domain.service.BookService;
import domain.service.BookServiceImpl;
import persistence.BookJdbc;
import persistence.BookJdbcImpl;
import presentation.BookManagementUI;

public class App {
    public static void main(String[] args) throws Exception {
        BookJdbc bookJdbc = new BookJdbcImpl();
        BookService bookService = new BookServiceImpl(bookJdbc);
        BookController bookController = new BookController();
        BookManagementUI bookManagementUI = new BookManagementUI(bookController, bookService);
    }
}
