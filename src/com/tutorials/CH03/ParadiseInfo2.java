package com.tutorials.CH03;
import java.util.Scanner;

public class ParadiseInfo2
{
    public static void main(String[] args)
    {
        displayInfo();


    }

    public static void displayInfo()
    {
        double price;
        double savings;
        double discount;
        Scanner keyboard = new Scanner(System.in);

        // Get input
        System.out.print("Enter the cutoff price to apply discount >> ");
        price = keyboard.nextDouble();

        //Prompt the user for the discount rate as a double

        System.out.print("Enter the discount rate as a whole number >> ");
        discount = keyboard.nextDouble();

        savings = computeDiscountInfo(price, discount);

        System.out.println("Special this week on any service over " + price);
        System.out.println("Discount of " + discount + " percent " );
        System.out.println("There is a savings of at least $" + savings);


        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");

    }

    public static double computeDiscountInfo(double pr, double dscnt)
    {
        double savings;
        savings = pr * dscnt / 100;
        return savings;
    }

}
