package com.tutorials.CH09;
import jdk.nashorn.internal.scripts.JO;

import java.util.*;
import javax.swing.*;


public class MySearch {

    public static void main(String[] args)
    {
        String [] menuChoices = new String [10];
        String entry = "";
        String menuString = "";
        int x = 0;
        int numEntered;
        int highestSub  = menuChoices.length -1;
        Arrays.fill(menuChoices, "zzzzzzz");
        menuChoices[x] = JOptionPane.showInputDialog(null
                                                     , "Enter an item for today's menu or zzz to quit"
                                                     , "Menu"
                                                     , 1
                                                    );
        while(!menuChoices[x].equals("zzz") && x < highestSub)
        {
           menuString = menuString + menuChoices[x] + "\n";
           ++x;
           if(x < highestSub)
               menuChoices[x] = JOptionPane.showInputDialog(null
                                                            , "Enter an item for today's menu or zzz to quit"
                                                            , "Menu"
                                                            , 1
                                                           );
        }
        numEntered = x;
        entry = JOptionPane.showInputDialog(null,
                                   "Today's menu is: \n" + menuString + "Please make a selection:"
                                            , "Make a selection"
                                            , 1
                                           );
        Arrays.sort(menuChoices, 0, numEntered);
        x = Arrays.binarySearch(menuChoices, entry);
        if(x >= 0 && x < numEntered)
        {
            JOptionPane.showMessageDialog(null, "Excellent choice");

        }
        else
            JOptionPane.showMessageDialog(null, "The entered menu item is not on today's list");


    }
}
