package Command_Processor;

import domain.service.BookService;

public class FindBookCommand implements Command {

    private BookService bookService;
    private int bookId;

    public FindBookCommand(int bookId, BookService bookService) {
        this.bookService = bookService;
        this.bookId = bookId;
    }

    @Override
    public void execute() {
        bookService.findBookById(bookId);
    }

}
