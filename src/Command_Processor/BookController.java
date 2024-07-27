package Command_Processor;

import java.util.LinkedList;
import java.util.Queue;

import observer.Publisher;

public class BookController extends Publisher {

    // Field
    private static BookController bookController = null;
    private Queue<Command> commandQueue = new LinkedList<>();

    // Constructors
    private BookController() {
    }

    public static BookController makeBookController() {
        if (bookController == null) {
            bookController = new BookController();
        }
        return bookController;
    }

    // Method, Function
    public void addCommand(Command command) {
        commandQueue.add(command);
    }

    public void processCommands() {
        while (!commandQueue.isEmpty()) {
            Command command = commandQueue.poll();
            command.execute();
            notifySubscribers();
        }
    }

}
