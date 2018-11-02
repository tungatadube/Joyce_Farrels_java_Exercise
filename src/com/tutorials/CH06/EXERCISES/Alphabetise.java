package com.tutorials.CH06.EXERCISES;

import javax.swing.*;

public class Alphabetise

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

       String displayStr = ((thirdString.compareToIgnoreCase(secondString) > 0) && (secondString.compareToIgnoreCase(firstString)> 0))
               ?"You entered the values in alphabetical order" : "You did not enter the values in alphabetical order.";
        System.out.println(displayStr);
    }


}

