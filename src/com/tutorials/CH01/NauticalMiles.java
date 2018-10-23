package com.tutorials.CH01;
import javax.swing.JOptionPane;

public class NauticalMiles

{

    public static void main(String[] args)
    {

        String strMiles = "The number of miles is %.2f " ;
        String strKilometers = "The number of Kilometers is %.2f ";
        double  NUMBER_OF_KILOMETERS = 1.852;
        double NUMBER_OF_MILES = 1.150779;
        double numberOFMiles;
        double numberOFKilometers;
        String nauticalMiles;
        int intNauticalMiles;

        nauticalMiles = JOptionPane.showInputDialog
                (null, "Enter the number of Nautical miles you want to convert."
                        , JOptionPane.PLAIN_MESSAGE);

        intNauticalMiles = Integer.parseInt(nauticalMiles);

        numberOFMiles = intNauticalMiles/NUMBER_OF_MILES;
        numberOFKilometers = intNauticalMiles/NUMBER_OF_KILOMETERS;

        System.out.printf(strMiles + "\n", numberOFMiles);
        System.out.printf(strKilometers + "\n", numberOFKilometers);

    }
}
