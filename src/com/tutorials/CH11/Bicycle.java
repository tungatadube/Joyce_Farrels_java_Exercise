package com.tutorials.CH11;
import javax.swing.*; 

public class Bicycle extends Vehicle
{
    public Bicycle()
    {
        super("a person", 2);
    }
@Override
public void setPrice()
{
    String entry;
    final int MAX = 4000;
    entry = JOptionPane.showInputDialog(null, "Enter the price for a bicycle", "Bike price", 1);
    price = Integer.parseInt(entry);
    price = (price > MAX) ? 4_000 : price;
}
@Override
public String toString()
{
    String displayString = String.format("The bicycle is powered by %s ; it has %s wheels and costs $%s", getPowerSource(), getWheels(), getPrice());
   return displayString;
}
}
