package Command_Processor;

import java.util.List;

import domain.Entity.Book;
import domain.service.BookService;

public class SearchBookByPublisherCommand implements Command {

    private BookService bookService;
    private String search;
    private List<Book> results;

    public SearchBookByPublisherCommand(String search, BookService bookService) {
        this.bookService = bookService;
        this.search = search;
    }

    @Override
    public void execute() {
        results = bookService.findBookByPublisher(search);
    }

    public List<Book> getResults() {
        return results;
    }

}
