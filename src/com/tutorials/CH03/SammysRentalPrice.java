package com.tutorials.CH03;

import javax.swing.*;

public class SammysRentalPrice

    /*
        a. Sammy’s Seashore Supplies rents beach equipment such as kayaks, canoes,
        beach chairs, and umbrellas to tourists. In Chapter 2, you wrote an application that prompts the user for the number of minutes a piece of sports
        equipment was rented, displays the company motto with a border, and
        displays the price for the rental. Now modify the program so that the main()
        method contains only three executable statements that each call a method
        as follows:
        The first executable statement calls a method that prompts the user for
        the rental time in minutes and returns the value to the main() method.
        The second executable statement calls a method that displays the company motto with the border.
        The last executable statement passes the number of minutes to a method
        that computes the hours, extra minutes, and price for the rental, and then
        displays all the details.
        Save the file as SammysRentalPriceWithMethods.java
     */
{
    final static int returnedValue = rentalPriceInMinutes(); // Only assign the value of minutes once
    public static void main(String[] args)
    {


        displayMotto();
        displayAllTheDetails();


    }

    public static int rentalPriceInMinutes()
    {
        int intMinutes;
        String minutes;
        minutes = JOptionPane.showInputDialog(null,
                "Enter the number of minutes spent with the equipment.",
                "Number of minutes", JOptionPane.PLAIN_MESSAGE);
        intMinutes = Integer.parseInt(minutes);
        return intMinutes;
    }
    public static void displayMotto()
    {
        System.out.println();
        System.out.println("\tSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("\tS                                  S");
        System.out.println("\tS Sammy's makes it fun in the sun! S");
        System.out.println("\tS                                  S");
        System.out.println("\tSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println();
    }
    public static void displayAllTheDetails()
    {

        String str;

        int pricePerHour = 40;
        int additionalPricePerMinute = 1;
        int extraMinutes;
        char currency = '$';

        // Getting and processing the input



        // performing the nepecessary calculations

        int  hours = (int) (returnedValue / 60);
        extraMinutes = returnedValue - hours * 60;
        int hourlyCost = pricePerHour * hours;
        int extraCost =  additionalPricePerMinute * extraMinutes;

        double totalAmountPayable = hourlyCost + extraCost ;

        String strInfo = "You spent " + returnedValue + " minutes with the equipment. ";
        if (hours == 1)
        {
            str =  "This translates to " + hours + " hour and " + extraMinutes + " minutes. ";

        }
        else
        {
            str =  "This translates to " + hours + " hours and " + extraMinutes + " minutes. ";

        }
        String strCharge = "The charges are: " + currency + pricePerHour + " per hour, and " + currency + additionalPricePerMinute + " for each minute outside an hour.";
        String strBill = "The total amount payable is thus : " + currency + totalAmountPayable + "." ;




        System.out.println(strInfo);
        System.out.println(str);
        System.out.println(strCharge);
        System.out.println(strBill);
    }
}
