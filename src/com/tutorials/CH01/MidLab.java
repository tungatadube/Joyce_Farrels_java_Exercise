package com.tutorials.CH01;
import javax.swing.JOptionPane;

public class MidLab
{
    public static void main(String[] args)
    {
       String noun1 =  JOptionPane.showInputDialog(null,
               "Enter a value for your first noun.", "First Noun", JOptionPane.PLAIN_MESSAGE);
        String noun2 =  JOptionPane.showInputDialog(null,
                "Enter a value for your second noun.", "Second Noun", JOptionPane.PLAIN_MESSAGE);
        String adjective = JOptionPane.showInputDialog(null,
            "Enter a value for your adjective.", "Adjective", JOptionPane.PLAIN_MESSAGE);
        String pastTenseVerb =  JOptionPane.showInputDialog(null,
                "Enter a value for your past tense verb.", "Past Tense Verb", JOptionPane.PLAIN_MESSAGE);

        String strNoun1 = "John had a " + adjective + " " + noun1 + " and " + noun2 + ".";
        String strNoun2 = "John has already " + pastTenseVerb + " his " + adjective + " " + noun2 + " and " + noun1
                + ".";
        System.out.println(strNoun1);
        System.out.println(strNoun2);
    }
}
