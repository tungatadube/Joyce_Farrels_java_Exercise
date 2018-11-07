package com.tutorials.CH12.Exercises;
import javax.swing.*;

public class Menu
{
    protected String[] entreeChoice = {"Rosemary Chicken", "Beef Wellington", "Maine Lobster", };
    private String menu = "";
    private int choice;

    public String displayMenu()
    {
        for(int x = 0; x < entreeChoice.length; ++x)
        {
            menu = String.format("%s, \n%s for %s", menu, x+1, entreeChoice[x]);
        }
        String input = JOptionPane.showInputDialog(null, "Type your selection, then press Enter" + menu, "Menu",1);
        choice = Integer.parseInt(input);
        return(entreeChoice[choice - 1]);
    }
}
