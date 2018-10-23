package com.tutorials.CH01;
import javax.swing.JOptionPane;

public class RandomMatchGuess
{
    public static void main(String[] args)
    {
        int MAX = 5;
        int valueToMatch = (int) (1 + Math.random() * MAX);
        String tryValue = JOptionPane.showInputDialog(null,
                "Guess the next number(1-5 inclusive) that will be generated",
                "Enter an Integer", JOptionPane.PLAIN_MESSAGE);
        int intTryValue = Integer.parseInt(tryValue);

        if (intTryValue == valueToMatch)

        {
            JOptionPane.showMessageDialog(null, "Yeah, uyinyanga mthakathi !");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Oh-no, unguTsikamdanda!");
        }



    }
}
