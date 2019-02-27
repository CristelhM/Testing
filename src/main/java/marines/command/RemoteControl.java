package main.java.marines.command;

/**
 * Invoker, this class will call our command.
 *
 * @author Marines Lopez Soliz
 */
public class RemoteControl {
    private Command command;

    /**
     * Set new Command.
     *
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * This method will execute the command.
     */
    public void pressButton() {
        command.execute();
    }
}
