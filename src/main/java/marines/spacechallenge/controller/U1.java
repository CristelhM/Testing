package main.java.marines.spacechallenge.controller;

/**
 * Concrete Rocket U1.
 *
 * Rocket cost = $100 Million. Rocket weight = 10 Tonnes Max. Max weight (with
 * cargo) = 18 Tonnes. Chance of launch explosion = 5% * (cargo carried / cargo
 * limit). Chance of landing crash = 1% * (cargo carried / cargo limit).
 *
 * @author Marines Lopez
 */
public class U1 extends Rocket {

    static final int PROBABILITY_LAUNCH = 5;
    static final int PROBABILITY_LAND = 1;
    private static final int U1_COST = 100000000;
    private static final int U1_WEIGHT = 10;
    private static final int U1_MAX_WEIGHT = 18;

    public U1() {
        super(U1_COST, U1_WEIGHT, U1_MAX_WEIGHT, PROBABILITY_LAUNCH, PROBABILITY_LAND);
    }
}