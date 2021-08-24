package ca.bcit.comp1510.lab11;

import java.text.DecimalFormat;

/**
 * Transaction class.
 * Defines a cart and allows you to add items to it. If you add more items than
 * the max cart size, the size will automatically increase by 3.
 * @author Sandhu, Avneet asandhu190@my.bcit.ca
 * @version 2021-04-12
 */
public class Transaction {
    
    /** cart array to be filled with items. */
    private Item[] cart;
    
    /** total price of items in cart. */
    private double totalPrice;
    
    /** number of item objects in array. */
    private int itemCount;
    
    /**
     * Constructs Transaction object by defining cart array size and setting
     * total price and item count to zero.
     * @param size
     *      cart array size
     */
    public Transaction(int size) {
        cart = new Item[size];
        totalPrice = 0;
        itemCount = 0;
    }
    
    /**
     * After checking if the cart array size needs to be increased this method 
     * gets item name, price and quantity, creates an item object and adds its 
     * to the cart array.
     * @param name
     *      item name
     * @param price
     *      item price
     * @param quantity
     *      item quantity
     */
    public void addToCart(String name, double price, int quantity) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        Item item = new Item(name, price, quantity);
        cart[itemCount] = item;
        itemCount++;
        totalPrice += price;
    }
    
    /**
     * After checking if the cart array size needs to be increased this method
     * adds an item object to the cart array.
     * @param item
     *      to be added
     */
    public void addToCart(Item item) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = item;
        itemCount++;
        totalPrice += item.getPrice();
    }
    
    /**
     * If trying to add more items than the max cart size, this method will 
     * increase the cart size by three.
     */
    public void increaseSize() {
        final int inc = 3;
        Item[] temp = new Item[cart.length + inc];
        
        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }
        
        cart = temp;
    }
    
    /**
     * gets total price of cart's items.
     * @return
     *      cart total price
     */
    public double getTotalPrice() {
        return totalPrice;
    }
    
    /**
     * counts how total number of items in the cart. 
     * @return
     *      count of items
     */
    public int getCount() {
        int count = 0;
        for (Item i : cart) {
            if (i != null) {
                count += i.getQuant();
            }
        }
        return count;
    }
    
    /**
     * Returns description of your cart.
     * @return description
     */
    public String toString() {
        DecimalFormat fmt = new DecimalFormat("#.##");
        String s = "Your cart contains: ";
        for (Item i : cart) {
            if (i != null) {
                s += "\n" + i;
            }
        }
        s += "\nNumber of items in cart: " + this.getCount();
        s += "\nTotal Price: $" + fmt.format(this.getTotalPrice());
        
        return s;
    }

}
