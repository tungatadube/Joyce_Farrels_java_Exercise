package com.tutorials.CH11;
import javax.swing.JOptionPane;

public class Sailboat extends Vehicle
{
    private  int length;

    public Sailboat()
    {
        super ("Wind", 0);
        setLength();
    }

    public void setLength()
    {
        String entry;
        entry = JOptionPane.showInputDialog(null, "Enter the sailboat length in feet ",
                "Sailboat Length", 1);
        length = Integer.parseInt(entry);

    }
    public int getLength()
    {
        return length;
    }
    @Override
    public void setPrice()
    {
        String entry;
        final int MAX = 100_000;
        entry = JOptionPane.showInputDialog( null, "Enter the sailboat price ",
                                             "Sailboat Price", 1 
                                           );
        price = Integer.parseInt(entry);
        if(price > MAX)
        price = MAX;
    }
    @Override
    public String toString()
    {
        String displayStr = "The " + getLength() + " foot sailboat is powered by " + getPowerSource() + "; it has " + getWheels() + " wheels and costs $" + getPrice();
        return displayStr;
    }


}
