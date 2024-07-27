package Command_Processor;

import java.util.List;

import domain.Model.Book;
import domain.service.BookService;

public class SearchBookCommand implements Command {

    private BookService bookService;
    private String search;
    private List<Book> results;

    public SearchBookCommand(String search, BookService bookService) {
        this.bookService = bookService;
        this.search = search;
    }

    @Override
    public void execute() {
        results = bookService.findBookByName(search);
    }

    public List<Book> getResults() {
        return results;
    }

}
