package com.tutorials.CH11;
import javax.swing.*;

public class Vehicledatabase
{
    public static void main(String...args)
    {
        Vehicle [] vehicles = new Vehicle [5];
        int x;

        for(x=0; x<vehicles.length; ++x)
        {
            System.out.println("x is " + x);
            String userEntry;
            int vehicleType;
            String message = "Please select the type of\nvehicle you want to enter:\n1--Sailboat\n2--Bicycle";
            String description = "Vehicle choice";
            userEntry = JOptionPane.showInputDialog(null, message, description, 1);
            try
                {
                    if ((Integer.parseInt(userEntry)==1) || (Integer.parseInt(userEntry)==2))
                    {
                    vehicleType = Integer.parseInt(userEntry);
                    vehicles[x] = (vehicleType == 1)? new Sailboat() : new Bicycle();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Please enter the numbers 1 0r 2", "Numbers out of specified range", 1);
                        --x;                        
                    }
                }
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "Please enter the numbers only", "Input is not a number", 1);  
                --x;             
            }
        }

        StringBuffer outString = new StringBuffer();
        for(x=0; x<vehicles.length; ++x)
        {
            outString.append ("\n" + (x+1) + " " );
            outString.append(vehicles[x].toString());
        }
        JOptionPane.showMessageDialog(null, "Our available Vehicles include:\n" + outString, "Available vehicles", 1);

    }
}
