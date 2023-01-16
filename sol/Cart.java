package sol;

import src.Item;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class representing a shopping cart of Items
 */
public class Cart {
    /**
     * Field representing the list of Items
     */
    private List<Item> items;

    /**
     * Constructor for a Cart
     *
     * @param items     the list of items in the cart
     */
    public Cart(List<Item> items) {
        this.items = new LinkedList<>(items);
    }

    /**
     * Method to compute the total cost of items in the cart, including discounts
     * Discounts are:
     *  - If the total cost of shoes in the cart is at least $100, take 20% off the cost of shoes
     *  - If there are at least two hats in the cart, take $10 off the entire order
     *
     * @return  the total cost including discounts
     */
    // UNCOMMENT WHEN READY TO IMPLEMENT
    // public double checkout() {}
}
