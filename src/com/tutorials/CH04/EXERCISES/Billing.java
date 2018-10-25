package com.tutorials.CH04.EXERCISES;
import javax.swing.JOptionPane;

public class Billing
    /*
    CH04 EX 2
         Create a class named Billing that includes three overloaded computeBill() methods
        for a photo book store.
        When computeBill() receives a single parameter, it represents the price of one
        photo book ordered. Add 8% tax, and return the total due.
        When computeBill() receives two parameters, they represent the price of a
        photo book and the quantity ordered. Multiply the two values, add 8% tax, and
        return the total due.
        When computeBill() receives three parameters, they represent the price of a
        photo book, the quantity ordered, and a coupon value. Multiply the quantity and
        price, reduce the result by the coupon value, and then add 8% tax and return the
        total due.
        Write a main() method that tests all three overloaded methods. Save the application
        as Billing.java.
     */

{
    public static void main(String[] args)
    {

        double price = Double.parseDouble(JOptionPane.showInputDialog
                (null, "Enter a value for price of the book.", "Price of the book", JOptionPane.PLAIN_MESSAGE));
        int quantity = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Enter the number of copies.", "Number of copies", JOptionPane.PLAIN_MESSAGE));
        double coupon = Double.parseDouble(JOptionPane.showInputDialog
                (null, "Enter the value of your coupon.", "Coupon", JOptionPane.PLAIN_MESSAGE));

        // testing the methods
    System.out.println("Calling computeBill on a single book gives a price of $" + computeBill( price));
    System.out.println("Calling computeBill on " + quantity + " books " + " gives a total price of $" + computeBill(price,quantity));
    System.out.println("calling computeBill on " + quantity + " books " + " gives a total price of $" + computeBill(price, quantity)
            + ". However applying your coupon of $" + coupon + " reduces the price to $" +  computeBill(price, quantity, coupon));

    }

    public static double computeBill(double prc)
    {
        double total = 1.08 * prc;
        return total;
    }

    public static double computeBill(double prc, int qnty)
    {
        double total = qnty * (1.08 * prc);
        return total;
    }

    public static double computeBill(double prc, int qnty, double cpn)
    {
        double total = qnty * (1.08 * prc) - cpn;
        return total;
    }
}
