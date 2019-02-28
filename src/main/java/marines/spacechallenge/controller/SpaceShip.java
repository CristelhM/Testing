package main.java.marines.spacechallenge.controller;

import main.java.marines.spacechallenge.data.Item;

/**
 * SpaceShip interface.
 *
 * @author Marines Lopez
 */
public interface SpaceShip {

    /**
     * a method that returns either true or false indicating if the launch was
     * successful or if the rocket has crashed.
     *
     * @return boolean
     */
    boolean launch();

    /**
     * A method that also returns either true or false based on the success of the
     * landing.
     *
     * @return boolean
     */
    boolean land();

    /**
     * A method that takes an Item as an argument and returns true if the rocket can
     * carry such item or false if it will exceed the weight limit.
     * 
     * @param item This is the item.
     * @return boolean
     */
    boolean canCarry(Item item);

    /**
     * A method that also takes an Item object and updates the current weight of the
     * rocket.
     *
     * @param item This is the item.
     */
    void carry(Item item);
}