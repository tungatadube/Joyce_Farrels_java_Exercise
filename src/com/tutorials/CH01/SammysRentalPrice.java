package com.tutorials.CH01;

import javax.swing.JOptionPane;

public class SammysRentalPrice
{
    public static void main(String[] args)
    {
        String minutes;
        String str;
        int intMinutes;
        int pricePerHour = 40;
        int additionalPricePerMinute = 1;
        int extraMinutes;
        char currency = '$';

        // Getting and processing the input

        minutes = JOptionPane.showInputDialog(null,
                "Enter the number of minupetes spent with the equipment.",
                "Number of minutes", JOptionPane.PLAIN_MESSAGE);
        intMinutes = Integer.parseInt(minutes);

        // performing the nepecessary calculations

        int  hours = (int) (intMinutes / 60);
        extraMinutes = intMinutes - hours * 60;
        int hourlyCost = pricePerHour * hours;
        int extraCost =  additionalPricePerMinute * extraMinutes;

        double totalAmountPayable = hourlyCost + extraCost ;

        String strInfo = "You spent " + intMinutes + " minutes with the equipment. ";
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



        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun! S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println();

        System.out.println(strInfo);
        System.out.println(str);
        System.out.println(strCharge);
        System.out.println(strBill);



    }
}
