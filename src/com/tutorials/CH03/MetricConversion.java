package com.tutorials.CH03;

import java.util.Scanner;

public class MetricConversion
{
    public static void main(String[] args)
            /*
            There are 2.54 centimeters in an inch, and there are 3.7854 liters in a U.S. gallon.
Create a class named MetricConversion. Its main() method accepts an integer value
from a user at the keyboard, and in turn passes the entered value to two methods.
One converts the value from inches to centimeters and the other converts the same
value from gallons to liters. Each method displays the results with appropriate
explanation. Save the application as MetricConversion.java.
             */
    {
        Double value;

        //prompt the user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a value to convert >>> ");
        value = keyboard.nextDouble();
        keyboard.nextLine();




        // display the values
        System.out.println(displayLiters(value));
        System.out.println(displayCentimeters(value));

    }



    public static String displayLiters(double val)
    {
        double valInLiters = val/3.7854;
        String displayValueInLiters = val + " Gallons is equivalent to " + valInLiters + " liters.";
        return displayValueInLiters;
    }

    public static String displayCentimeters(double val)
    {
        double valInCentimeters = val/2.54;
        String displayValueInCentimeters = val + " Inches is equivalent to " + valInCentimeters + " centimeters.";
        return displayValueInCentimeters;
    }


}
