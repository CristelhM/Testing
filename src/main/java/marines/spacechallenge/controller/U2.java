package main.java.marines.spacechallenge.controller;

/**
 * Concrete Rocket U2.
 *
 * Rocket cost = $120 Million Rocket weight = 18 Tonnes Max weight (with cargo)
 * = 29 Tonnes Chance of launch explosion = 4% * (cargo carried / cargo limit)
 * Chance of landing crash = 8% * (cargo carried / cargo limit)
 *
 * @author Marines Lopez
 */
public class U2 extends Rocket {

    final static int PROBABILITY_LAUNCH = 4;
    final static int PROBABILITY_LAND = 8;
    private static final int U2_COST = 120000000;
    private static final int U2_WEIGHT = 18;
    private static final int U2_MAX_WEIGHT = 29;

    public U2() {
        super(U2_COST, U2_WEIGHT, U2_MAX_WEIGHT, PROBABILITY_LAUNCH, PROBABILITY_LAND);
    }
}