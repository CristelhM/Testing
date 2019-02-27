package main.java.marines.command;

/**
 * Concrete Command to turn off the lights.
 *
 * @author Marines Lopez Soliz
 */
public class LightOffCommand implements Command {
    // reference to the light
    Light light;

    /**
     * Constructor parameterized.
     * 
     * @param light Light
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
    }
}
