package main.java.marines.spacechallenge.data;

/**
 * Represent an item that will be part of the cargo in the rocket.
 *
 * @author Marines Lopez
 */
public class Item {

    private String name;
    private int weight;

    /**
     * Parameterized constructor
     *
     * @param name   This is the name.
     * @param weight This is the weight.
     */
    public Item(final String name, final int weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Getter of name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter of name.
     *
     * @param name string
     */
    public void setName(final String name) {
        this.name = name;
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
     * @param weight int
     */
    public void setWeight(final int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item[name=" + name + ", weight=" + weight + "]";
    }
}