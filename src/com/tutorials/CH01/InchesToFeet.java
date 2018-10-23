package com.tutorials.CH01;
import javax.swing.JOptionPane;

public class InchesToFeet
{
    public static void main(String[] args)
    {
        int factor = 12;
        String inches;
        String str;

        //get the input from a dialog

        inches = JOptionPane.showInputDialog(null, "Please enter your value in inches"
                , "Inches to feet", JOptionPane.PLAIN_MESSAGE);

        // convert the input to double format
        double aDouble = Double.parseDouble(inches);

        int feetInValue = (int) aDouble / factor;
        int remainder = (int)aDouble % factor;
        str = "There are " + feetInValue + " feet and " + remainder + " inches in this value.";
        JOptionPane.showMessageDialog(null, str);
    }
}
