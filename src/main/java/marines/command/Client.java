package main.java.marines.command;

/**
 * This class simulate a client.
 *
 * @author Marines Lopez Soliz
 */
public class Client {

    /**
     * Main method.
     * 
     * @param args
     */
    public static void main(String[] args) {
        final RemoteControl control = new RemoteControl();
        final Light light = new Light();
        final Command lightsOn = new LightOnCommand(light);
        final Command lightsOff = new LightOffCommand(light);
        // switch on
        control.setCommand(lightsOn);
        control.pressButton();
        // switch off
        control.setCommand(lightsOff);
        control.pressButton();
    }
}