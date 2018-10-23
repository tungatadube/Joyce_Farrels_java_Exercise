package com.tutorials.CH01;

import javax.swing.JOptionPane;

public class SammysMotto
{
    public static void main(String[] args)
    {
        int pricePerPerson = 35;
        char currency = '$';
        String numberOfGuests;
        int intNumberOfGuests;
        int largeEvent = 50;

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun! S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        numberOfGuests = JOptionPane.showInputDialog(null,
                "Enter the number of guests.", "Number of guests", JOptionPane.PLAIN_MESSAGE);
        intNumberOfGuests = Integer.parseInt(numberOfGuests);

        double totalPrice = intNumberOfGuests * pricePerPerson;
        String str = "You have " + intNumberOfGuests + " guests you will be charged " + currency + totalPrice + " at "
                + currency + pricePerPerson + " per guest.";
        System.out.println(str);
        if (intNumberOfGuests >= 50)
        {
            System.out.println("true");
        }
    }
}