package main.java.marines.spacechallenge.controller;

import java.util.Random;

import main.java.marines.spacechallenge.data.Item;

/**
 * Class that represent a Rocket that will travel to mars with some things.
 *
 * @author Marines Lopez
 */
public abstract class Rocket implements SpaceShip {

    protected int cost;
    protected int weight;
    protected int maxWeight;
    protected int probLaunch;
    protected int probLand;

    /**
     * Parameterized constructor.
     *
     * @param cost       rocket cost
     * @param weight     rocket weight
     * @param maxWeight  supported by the rocket
     * @param probLaunch probability of bad launch
     * @param probLand   probability of bad land
     */
    public Rocket(final int cost, final int weight, final int maxWeight, final int probLaunch, final int probLand) {
        super();
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.probLaunch = probLaunch;
        this.probLand = probLand;
    }

    /**
     * Getter of cost.
     *
     * @return cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * Setter of cost.
     *
     * @param cost This is the cost.
     */
    public void setCost(final int cost) {
        this.cost = cost;
    }

    /**
     * Getter of weight.
     *
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Setter of weight.
     *
     * @param weight This is the weight.
     */
    public void setWeight(final int weight) {
        this.weight = weight;
    }

    /**
     * Getter of maxWeight.
     *
     * @return maxWeight
     */
    public int getMaxWeight() {
        return maxWeight;
    }

    /**
     * Setter of maxWeight.
     *
     * @param maxWeight This is the maxWeight.
     */
    public void setMaxWeight(final int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public boolean canCarry(final Item item) {
        return (this.weight + item.getWeight()) <= this.maxWeight;
    }

    @Override
    public void carry(final Item item) {
        if (canCarry(item)) {
            this.weight = this.weight + item.getWeight();
        }
    }

    @Override
    public boolean launch() {
        final int chance = (probLaunch / 100) * (this.weight / this.maxWeight);
        return chance < ((new Random()).nextInt(100));
    }

    @Override
    public boolean land() {
        final int chance = (probLand / 100) * (this.weight / this.maxWeight);
        return chance < (Math.random() * 100);
    }
}