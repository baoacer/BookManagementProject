package Command_Processor;

import domain.service.BookService;

public class RemoveBookCommand implements Command {

    private BookService bookService;
    private int id;

    public RemoveBookCommand(int id, BookService bookService) {
        this.bookService = bookService;
        this.id = id;
    }

    @Override
    public void execute() {
        bookService.removeBook(id);
    }

}
