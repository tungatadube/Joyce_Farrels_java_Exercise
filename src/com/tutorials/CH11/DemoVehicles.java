package com.tutorials.CH11;
import javax.swing.*;

public class DemoVehicles
{
    public static void main(String[] args)
    {
       Sailboat aBoat = new Sailboat();
       Bicycle aBike = new Bicycle();
        String formatedString = String.format("\nVehicle descriptions:\n %s \n %s", aBoat.toString(), aBike.toString());
       JOptionPane.showMessageDialog(null, formatedString, "Descriptions", 1);
    }
}
