package test.java.marines.command;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.marines.command.Command;
import main.java.marines.command.Light;
import main.java.marines.command.LightOffCommand;
import main.java.marines.command.LightOnCommand;
import main.java.marines.command.RemoteControl;

/**
 * Test suit for our command pattern example.
 *
 * @author Marines Lopez Soliz
 */
class RemoteControlTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void remoteControl_TurnOnLight_Ok() {
        final RemoteControl control = new RemoteControl();
        final Light light = new Light();
        final Command lightsOn = new LightOnCommand(light);
        // switch on
        control.setCommand(lightsOn);
        control.pressButton();
        assertTrue(light.isOn());
    }

    @Test
    void remoteControl_TurnOffLight_Ok() {
        final RemoteControl control = new RemoteControl();
        final Light light = new Light();
        final Command lightsOff = new LightOffCommand(light);
        // switch off
        control.setCommand(lightsOff);
        control.pressButton();
        assertFalse(light.isOn());
    }

}
