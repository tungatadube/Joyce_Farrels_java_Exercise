package com.tutorials.CH03;

import java.util.Scanner;

public class CraftPricing
    // CH03 Exercise 10

    /*
        Caitlyn’s Crafty Creations computes a retail price for each product as the cost of
        materials plus $12 multiplied by the number of hours of work required to create the
        product, plus $7 shipping and handling. Create a class that contains a main() method
        that prompts the user for the name of a product (for example, “woven purse”), the
        cost of materials, and the number of hours of work required. Pass the numeric data to
        a method that computes the retail price of the product and returns the computed
        value to the main() method where the product name and price are displayed. Save
        the program as CraftPricing.java.
     */

{
    final private static int MULTIPLYING_FACTOR = 12; // These constants are visible everywhere inside the class save for outside it
    final private static int SHIPPING_AND_HANDLING = 7;

    public static void main(String[] args)

    {
        // declare the variables that will be the arguments of the computing method that will be called inside main()

        String nameOfTheProduct;
        double costOfMaterial;
        double numberOfHoursRequired;
        Scanner keyboard = new Scanner(System.in);

         String [] strings = {"Enter a value for the name of the product >>> ",
                             "Enter a value for the cost of materials for making the product >>> ",
                             "Enter a value for the number of hours recquired for making the product >>> ",
                             "The price of %s is $%.2f",
                              };

        // get the values for the variables i.e prompt the user

        System.out.println(strings[0]);
        nameOfTheProduct = keyboard.nextLine();
        System.out.println(strings[1]);
        costOfMaterial = keyboard.nextDouble();
        keyboard.nextLine(); // clear the keyboard buffer
        System.out.println(strings[2]);
        numberOfHoursRequired = keyboard.nextDouble();
        keyboard.nextLine();// clear the keyboard buffer
        keyboard.close(); // close the keyboard

        // call the function and display the results

        System.out.printf(strings[3], nameOfTheProduct,calculateAndDisplayResult(costOfMaterial, numberOfHoursRequired));

    }

    public static double calculateAndDisplayResult( double cost, double hours)
    {
        double price = cost + MULTIPLYING_FACTOR * hours + SHIPPING_AND_HANDLING; // calculating the main
        return price;
    }
}
