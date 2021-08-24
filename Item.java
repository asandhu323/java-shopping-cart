package ca;

/**
 * Item class. An item is defined by it's name, price and quantity.
 * @author Sandhu, Avneet asandhu190@my.bcit.ca
 * @version 2021-04-12
 */
public class Item {
    
    /** Item name. */
    private final String name;
    
    /** Item price. */
    private final double price;
    
    /** Item quantity. */
    private final int quant;
    
    /**
     * Constructs an item by defining its name, price and quantity.
     * @param name
     *      Item name
     * @param price
     *      Item price
     * @param quant
     *      Item quantity
     */
    public Item(String name, double price, int quant) {
        this.name = name;
        this.price = price;
        this.quant = quant;
    }
    
    /**
     * Constructs an item by defining its name, price and set its quantity to 1.
     * @param name
     *      Item name
     * @param price
     *      Item price
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.quant = 1;
    }
    
    /**
     * Returns Item name.
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns Item price.
     * @return price
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Returns Item quantity.
     * @return quantity
     */
    public int getQuant() {
        return quant;
    }
    
    /**
     * Returns Item description.
     * @return description
     */
    public String toString() {
        return "Name: " + name + "\tPrice: $" + price + "\tQuantity: " + quant;
    }
 
}
