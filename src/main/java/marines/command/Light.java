package main.java.marines.command;

/**
 * This class will be our Receiver and represent a light.
 *
 * @author Marines Lopez Soliz
 */
public class Light {
    private boolean on;

    /**
     * Switch on the lights
     */
    public void switchOn() {
        on = true;
    }

    /**
     * Switch of the lights
     */
    public void switchOff() {
        on = false;
    }

    /**
     * Say if the light is on or off.
     * 
     * @return boolean
     */
    public boolean isOn() {
        return on;
    }
}