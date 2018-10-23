package com.tutorials.CH01;

public class Dollars
{

    public static void main(String[] args)
    {
        int twenties = 20;
        int tens = 10;
        int fives = 5;
        int ones = 1;
        int moneyAtHand = 1019;
        int numTwenties;
        int numTens;
        int numfives;
        int numones;


        if (moneyAtHand % twenties == 0)
        {
            numTwenties = moneyAtHand / twenties;
            numTens = 0;
            numfives = 0;
            numones = 0;

        }

        else
        {
            numTwenties = (int) (moneyAtHand / twenties);

            numTens = (int) ((moneyAtHand - (numTwenties * twenties)) / tens);

            numfives = (int) (((moneyAtHand - (numTwenties * twenties)-(numTens * tens))) / fives);

            numones = (int) ((((moneyAtHand - (numTwenties * twenties)-(numTens * tens))-(numfives * fives))));


        }

        if (moneyAtHand % 20 > 15)
        {
            System.out.println("From the amount you wish to withdraw you will get the following denominations: ");
            System.out.println(numTwenties + " x Twenty dollar bills.");
            System.out.println(numTens + " x Ten dollar bills.");
            System.out.println(numfives + " x Five dollar bills.");
            System.out.println(numones + " x One dollar bills.");
        }

        else if (moneyAtHand % 20 == 0)
        {
            System.out.println("From the amount you wish to withdraw you will get " + numTwenties + " x Twenty dollar bills.");

        }

        {

        }
    }
}
