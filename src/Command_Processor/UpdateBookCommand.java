package Command_Processor;

import domain.Model.Book;
import domain.service.BookService;

public class UpdateBookCommand implements Command {

    private BookService bookService;
    private Book book;

    public UpdateBookCommand(Book book, BookService bookService) {
        this.bookService = bookService;
        this.book = book;
    }

    @Override
    public void execute() {
        bookService.updateBook(book);
    }

}
