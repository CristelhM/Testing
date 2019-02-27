package main.java.marines.command;

/**
 * Concrete Command to turn on the lights.
 *
 * @author Marines Lopez Soliz
 */
public class LightOnCommand implements Command {
    // reference to the light
    Light light;

    /**
     * Constructor parameterized.
     * 
     * @param light Light
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }
}