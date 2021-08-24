package ca;

import java.util.Scanner;

/**
 * Shopping program. Uses the Item and Transaction classes to simulate a 
 * shopping experience. 
 * @author Sandhu, Avneet asandhu190@my.bcit.ca
 * @version 2021-04-12
 */
public class Shopping {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        int choice = 0;
        final double amount = 15.99;
        final int quit = 4;
        final int three = 3;
        Scanner scan = new Scanner(System.in);
        
        //when the loops says "add standard item to cart" it will display use of
        //the second addToCart method, which accepts an Item object, using
        //this item below
        Item standard = new Item("shampoo", amount, 2);
        
        System.out.println("Welcome to the Shopping program!\nHow many"
                + " items should your cart hold?");
        int count = scan.nextInt();
        Transaction cart = new Transaction(count);
        
        while (choice != quit) {
            
            System.out.println("\nPress 1 to define an item to add to your "
                    + "cart.\nPress 2 to add the standard item to you cart."
                    + "\nPress 3 to see your cart.\nPress 4 to quit.");
            if (!scan.hasNextInt()) {
                scan.next();
                System.out.println("This is an invalid input. Enter a number"
                        + " from 1-4");
            
            } else  {
                choice = scan.nextInt();
            
                if (choice < 1 || choice > quit) {
                    System.out.println("That's not a valid choice!");
                } else {
                    switch (choice) {
                        case 1:
                            System.out.println("Enter item name: ");
                            String name = scan.next();
                            System.out.println("Enter item price: ");
                            double price = scan.nextDouble();
                            System.out.println("Enter item quantity: ");
                            int quant = scan.nextInt();
                            cart.addToCart(name, price, quant);
                            break;
                        case 2:
                            cart.addToCart(standard);
                            break;
                        case three: 
                            System.out.println(cart);
                            break;
                        default:
                            System.out.println("Thanks for shopping!");
                            return;
                    }
                }
            }
        }
        scan.close();
    }

}
