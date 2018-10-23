package com.tutorials.CH01;

import javax.swing.JOptionPane;

public class Initials
{
    public static void main(String[] args)
    {
        String initials;
        String str = "Your initials are ";

        initials = JOptionPane.showInputDialog(null,
                "Please enter your initials separated by dots."
                , "The initialiser", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, str + initials);

    }
}
