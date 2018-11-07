package com.tutorials.CH12.Exercises;
import javax.swing.*;

public class PlainVegetarianMenu
{
    public static void main(String[] args)
    {
        VegetarianMenu briefMenu  = new VegetarianMenu();
        PickMenu2 entree = null;
        String guestChoice = new String();

        try
        {
            PickMenu2 selection = new PickMenu2(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        }
        catch(MenuException error)
        {
            guestChoice = " incorrectly, please enter the number not the first letter of the selection";
        }
        catch(Exception error)
        {
            guestChoice = "an invalid vegetarian selection";

        }
        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
    }

}
