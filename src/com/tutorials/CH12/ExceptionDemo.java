package com.tutorials.CH12;
import java.util.InputMismatchException;

import javax.swing.*;

public class ExceptionDemo
{
    public static void main(String[] args)
    {
        int numerator = 0;
        int denominator = 0;
        int result;
        String inputString;

        try
        {
            inputString = JOptionPane.showInputDialog(null
                                                      , "Enter a number to be divided"
                                                      , "Numerator"
                                                      , 1
                                                     );
            numerator = Integer.parseInt(inputString);

            inputString = JOptionPane.showInputDialog(null
                                                      , "Enter a number to divide into the first number"
                                                      , "Denominator"
                                                      , 1
                                                     );
            denominator = Integer.parseInt(inputString);
            result = numerator/denominator;

        }
        catch(ArithmeticException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Division by zero", 1);
            result = 0;
        }
        catch(InputMismatchException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter digits only", "Incorrect Entry", 1);
            result = 0;
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter digits only", "Incorrect Entry", 1);
            result = 0;
        }

        JOptionPane.showMessageDialog(null, numerator + "/" + denominator + "\nResult is " + result);
        


    }




}
