package com.tutorials.CH03;
import java.util.Scanner;

public class PaintCalculator
    /*
    Assume that a gallon of paint covers about 350 square feet of wall space. Create an
application with a main() method that prompts the user for the length, width, and
height of a rectangular room. Pass these three values to a method that does the
following:
Calculates the wall area for a room
Passes the calculated wall area to another method that calculates and returns the
number of gallons of paint needed
Displays the number of gallons needed
Computes the price based on a paint price of $32 per gallon, assuming that the
painter can buy any fraction of a gallon of paint at the same price as a whole gallon
Returns the price to the main() method
The main() method displays the final price. For example, the cost to paint a 15-by-
20-foot room with 10-foot ceilings is $64. Save the application as PaintCalculator.java.
     */
{

    // set constant variables that are visible everywhere inside the class

final private static int AREA_PER_GALLON = 350;
final private static int PAINT_PRICE = 35;


    public static void main(String[] args)
    {

        double length;
        double height;
        double width;
        String displayStr;
        char currency = '$';
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a value for the length of the room in feet >>> ");
        length = keyboard.nextDouble();
        System.out.println("Enter a value for the height of the room in feet >>> ");
        height = keyboard.nextDouble();
        System.out.println("Enter a value for the width of the room in feet >>> ");
        width = keyboard.nextDouble();


        displayStr = "The cost to paint a " + length + "-by-" + width + "-foot room with "
                + height + "-foot ceilings is " + currency + "%.2f" + ".";
        System.out.printf(displayStr, priceOfPaint(length, height, width));
    }


public static double priceOfPaint(double len, double hgt, double wdth)
{
    double price;
    double numGalons;
    double totalArea;
    totalArea = 2* hgt * (len + wdth) + len * wdth;
    numGalons = totalArea / AREA_PER_GALLON;
    price = numGalons * PAINT_PRICE;
    return price;
}
}
