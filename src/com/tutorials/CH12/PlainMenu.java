package com.tutorials.CH12;
import javax.swing.*;

public class PlainMenu
{
    public static void main(String[] args)
    {
        Menu briefMenu  = new Menu();
        PickMenu entree = null;
        String guestChoice = new String();

        try
        {
            PickMenu selection = new PickMenu(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        }
        catch(Exception error)
        {
            guestChoice = "an invalid selection";

        }
        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
    }

}
