package Command_Processor;

import java.util.LinkedList;
import java.util.Queue;

import observer.Publisher;

public class BookController extends Publisher {

    // Field
    private Queue<Command> commandQueue = new LinkedList<>();

    // Constructors
    public BookController() {
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

    // private static CommandProcessor commandProcessor = null;
    // public static CommandProcessor makeCommandProcessor() {
    // if (commandProcessor == null) {
    // commandProcessor = new CommandProcessor();
    // }
    // return commandProcessor;
    // }

}
