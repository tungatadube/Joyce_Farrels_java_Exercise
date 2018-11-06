package com.tutorials.CH12;
import javax.swing.*;


public class PickMenu
{
    private Menu briefMenu;
    private String guestChoice = new String();

    public PickMenu(Menu theMenu)
    {
        briefMenu = theMenu;
        setGuestChoice();

    }
    public void setGuestChoice()
    {
        JOptionPane.showMessageDialog(null, "Choose from the following menu:", "Menu",1);
        guestChoice = briefMenu.displayMenu();
    }
    public String getGuestChoice()
    {
        return(guestChoice);
    }
}
