package Command_Processor;

import domain.Entity.Book;
import domain.Entity.TextBook;
import domain.service.BookService;

public class AddBookCommand implements Command {

    private BookService bookService;
    private Book book;

    public AddBookCommand(Book book, BookService bookService) {

        this.bookService = bookService;

        if (book instanceof TextBook) {
            TextBook textBook = (TextBook) book;
            this.book = textBook;
        } else {
            this.book = book;
        }
    }

    @Override
    public void execute() {
        bookService.addBook(book);
    }
}
