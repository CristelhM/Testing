package main.java.marines.spacechallenge.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.java.marines.spacechallenge.controller.Rocket;
import main.java.marines.spacechallenge.controller.SpaceShip;
import main.java.marines.spacechallenge.controller.U1;
import main.java.marines.spacechallenge.controller.U2;
import main.java.marines.spacechallenge.data.Item;

/**
 * Simulator of a rocket land.
 *
 * @author Marines Lopez
 */
public class Simulation {

    /**
     * Load items from a file.
     *
     * @param fileName This is the file name.
     * @return item list
     */
    public List<Item> loadItems(final String fileName) {
        // File file2 = new File("Phase-2.txt");"Phase-1.txt"
        final List<Item> items = new ArrayList<Item>();
        Scanner s;
        try {
            s = new Scanner(new File(fileName));
            while (s.hasNextLine()) {
                final String line = s.nextLine();
                final String[] parts = line.split("=");
                items.add(new Item(parts[0], getWeight(parts[1])));
            }
        } catch (final FileNotFoundException e) {
            e.printStackTrace();
        } catch (final Exception e) {
            e.printStackTrace();
        }
        return items;
    }

    private int getWeight(final String weight) {
        return Integer.parseInt(weight) / 1000;
    }

    /**
     * Load Rockets from an item list with the clazz type(U1, U2).
     *
     * @param items This is the items.
     * @param clazz This is the clazz.
     * @return spaceship This is the list.
     */
    public List<SpaceShip> loadRokets(final List<Item> items, final Class clazz) {
        final List<SpaceShip> rockets = new ArrayList<SpaceShip>();
        // fill the rockets with items
        SpaceShip rocket = createSpaceShip(clazz);
        for (final Item item : items) {
            if (rocket.canCarry(item))
                rocket.carry(item);
            else {
                rockets.add(rocket);
                rocket = createSpaceShip(clazz);
            }
        }
        return rockets;
    }

    private SpaceShip createSpaceShip(final Class clazz) {
        return clazz.equals(U1.class) ? new U1() : new U2();
    }

    /**
     * calculate the total cost of create the rockets in the list.
     *
     * @param rockets This is the rockets.
     * @return int total cost.
     */
    public int runSimulation(final List<SpaceShip> rockets) {
        int count = 0;
        int totalCost = 0;
        for (final SpaceShip rocket : rockets) {
            while (!(rocket.land() && rocket.launch())) {
                count++;
                totalCost += ((Rocket) rocket).getCost();
            }
            count++;
            totalCost += ((Rocket) rocket).getCost();
        }
        System.out.println(count + " Rockets launched of type " + rockets.get(0).getClass().getName() + ". Total cost "
                + totalCost + "$us");
        return totalCost;
    }

    /**
     * Main method.
     *
     * @param args This is the arguments from console execution.
     */
    public static void main(final String[] args) {
        final Simulation s = new Simulation();
        s.simulatePhase("resources/Phase-1.txt");
        s.simulatePhase("resources/Phase-2.txt");
    }

    private void simulatePhase(final String filepath) {
        final List<Item> items = loadItems(filepath);
        System.out.println(items);
        runSimulation(loadRokets(items, U1.class));
        runSimulation(loadRokets(items, U2.class));
    }
}