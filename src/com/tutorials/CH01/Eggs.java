package com.tutorials.CH01;
import javax.swing.JOptionPane;

public class Eggs
{
    public static void main(String[] args)
    {
        double dozenPrice = 3.25;
        double individualPrice = 0.45;
        String numOrderedEggs;
        String str;
        int DOZEN = 12;

        numOrderedEggs = JOptionPane.showInputDialog(null,
                "Enter the number of eggs needed for your order", "Number off eggs.", JOptionPane.PLAIN_MESSAGE);

        // Get the number of eggs as an int

        int intNumOrderedEggs = Integer.parseInt(numOrderedEggs);

        // Make the necessary conversions

        int numDozen = (int)(intNumOrderedEggs / DOZEN);
        int extraEggs = (int) (intNumOrderedEggs % DOZEN);
        double totalPayable = numDozen * dozenPrice + extraEggs * individualPrice;

        if (extraEggs != 0 && extraEggs != 1)
        {
            str = "That's " + numDozen + " dozen at $" + dozenPrice + " and "
                    + extraEggs + " loose eggs at $" + individualPrice + "each, The total due is thus $%.2f.";
        }
        else if (extraEggs == 1)
        {
            str = "That's " + numDozen + " dozen at $" + dozenPrice + " and "
                    + extraEggs + " one loose egg at $" + individualPrice + ". The total due is thus $%.2f.";
        }
        else
        {
            str = "That's " + numDozen + " dozen at $" + dozenPrice  + ". The total due is thus $%.2f.";
        }

        System.out.printf(str, totalPayable);


    }
}
