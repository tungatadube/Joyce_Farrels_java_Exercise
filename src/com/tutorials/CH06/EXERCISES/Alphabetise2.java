package com.tutorials.CH06.EXERCISES;

import javax.swing.*;

public class Alphabetise2

{
    /*
         Write an application that accepts three Strings from the user and displays one of
        two messages depending on whether the user entered the Strings in alphabetical
        order without regard to case. Save the file as Alphabetize.java.
     */

    public static void main(String[] args)
    {
        String input;
        String firstString = " ";
        String secondString = " ";
        String thirdString = " ";
        String val1 = " ";
        String val2 = " ";
        String val3 = " ";
        String displayStr = "The values you entered take the form,\n%s, %s, %s,\nwhen displayed in alphabetical order.";
        input = JOptionPane.showInputDialog(
                             null
                                            , "Enter three strings separated by spaces >>> "
                                            , "Enter strings"
                                            , 1

                                           );
        int x = 0;
        while (x < input.length())
        {
            if (input.charAt(x) == ' ')
            {
                firstString = input.substring(0,x);
                break;

            }
            ++x;
        }

        int a = 0;
        secondString = input.substring(x + 1, input.length());
        while (a < secondString.length())
        {
            if (secondString.charAt(a) == ' ')
            {
                secondString = secondString.substring(0,a);
                thirdString = input.substring((firstString.length() + secondString.length() + 2), input.length() );
                break;

            }
            ++a;
        }

       val1 = (firstString.compareToIgnoreCase(secondString) < 0)?firstString : secondString;
        val1 = (val1.compareToIgnoreCase(thirdString) < 0)? val1 : thirdString;

        if (val1.equals(firstString))
        {
            val2 = (secondString.compareToIgnoreCase(thirdString) < 0)?secondString : thirdString;

            if (val2 == secondString)
            {
               val3 = thirdString;
            }
            else
            {
                val2 = thirdString;
                val3 = secondString;
            }
            System.out.printf(displayStr, val1, val2, val3);
        }

        if (val1.equals(secondString))
        {
            val2 = (firstString.compareToIgnoreCase(thirdString) < 0)?firstString : thirdString;

            if (val2 == firstString)
            {
                val3 = thirdString;
            }
            else
            {
                val2 = thirdString;
                val3 = firstString;
            }
            System.out.printf(displayStr, val1, val2, val3);
        }

        if (val1.equals(thirdString))
        {
            val2 = (secondString.compareToIgnoreCase(firstString) < 0)?secondString : thirdString;

            if (val2 == secondString)
            {
                val3 = firstString;
            }
            else
            {
                val2 = firstString;
                val3 = secondString;
            }
            System.out.printf(displayStr, val1, val2, val3);
        }
    }


}

