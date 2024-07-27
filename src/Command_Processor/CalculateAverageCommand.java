package Command_Processor;

import domain.service.BookService;

public class CalculateAverageCommand implements Command {

    private BookService bookService;
    private double result;

    public CalculateAverageCommand(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void execute() {
        result = bookService.calculateAverage();
    }

    public double getResult() {
        return result;
    }
}
