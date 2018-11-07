package com.tutorials.CH12.Exercises;
import javax.swing.*;

public class Menu2
{
    protected String[] entreeChoice = {"Rosemary Chicken", "Beef Wellington", "Maine Lobster", };
    private String menu = "";
    private int choice;

    protected char[]  initial= new char[entreeChoice.length];

    public String displayMenu() throws MenuException
    {
        for(int x = 0; x < entreeChoice.length; ++x)
        {
            menu = String.format("%s, \n%s for %s", menu, x+1, entreeChoice[x]);
            initial[x]  = entreeChoice[x].charAt(0);
        }
        String input = JOptionPane.showInputDialog(null, "Type your selection, then press Enter" + menu, "Menu",1);
        for(int y = 0; y < entreeChoice.length; ++y)
            if((Character.toString(input.charAt(0)).toUpperCase()).equals(Character.toString(initial[y])))
                throw(new MenuException(entreeChoice[y]));

        choice = Integer.parseInt(input);
        return(entreeChoice[choice - 1]);
    }
}
