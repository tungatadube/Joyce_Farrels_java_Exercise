package com.tutorials.CH03;
import java.util.Scanner;

public class Insurance
    // CH03 Solution to Exercise 9

    /*
        The Harrison Group Life Insurance company computes annual policy premiums based
        on the age the customer turns in the current calendar year. The premium is computed
        by taking the decade of the customer’s age, adding 15 to it,and multiplying by 20.
        For example, a 34  year old would pay $360,which is calculated by adding the decades
        (3) to 15, and then multiplying by 20. Write an application that prompts a user for
        the current year and a birth year. Pass both to a method that calculates and returns the premium amount,
        and then display the returned amount. Save the application as Insurance.java.
     */

{
    // these values will not change and are sensitive so they must not be accessed from outside the class

    final public static int VALUE_TO_ADD = 15;
    final public  static  int VALUE_TO_MULTIPLY = 20;

    public static void main(String[] args)
    {
        // declare variables to pass into the computing function

        int currentYear;
        int birthYear;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the current year in the format 'XXXX' >>> ");
        currentYear = keyboard.nextInt();

        //Consume the Enter key

        keyboard.nextLine();

        System.out.println("Please enter your year of birth in the format 'XXXX' >>> ");
        birthYear = keyboard.nextInt();

        //Display the premium by calling the function to return the premium
            //But first get a string so that you can format the premium to display nicely.

        String str = "Your premium is $%.2f.";
        System.out.printf(str, displayPrice(currentYear, birthYear));
    }
        public static double displayPrice(int currentYr, int birthYr)
    {
        int age;
        int decades;
        double premium;

        age = currentYr - birthYr;
        decades = (int) (age / 10);

        premium = (decades + VALUE_TO_ADD) * VALUE_TO_MULTIPLY;

        return premium;

    }
}
