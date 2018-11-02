package com.tutorials.CH04.EXERCISES;

import javax.swing.*;

public class TestBloodData
{
    /*
            a.  Create a class named BloodData that includes fields that hold a blood type (the
                four blood types are O, A, B, and AB) and an Rh factor (the factors are + and –).
                Create a default constructor that sets the fields to “O” and “+”, and an overloaded
                constructor that requires values for both fields. Include get and set methods for
                each field. Save this file as BloodData.java. Create an application named
                TestBloodData that demonstrates each method works correctly. Save the
                application as TestBloodData.java.
         */

    public static void main(String[] args) {
    // Instatiate two BloodData objects for testing the methods

        BloodData bloodType1 = new BloodData();
        BloodData bloodType2 = new BloodData("A", "+");

        getData(bloodType1);
display(bloodType2);

        System.out.printf(display(bloodType1), bloodType1.getRhFactor(),bloodType1.getBloodType());
        System.out.printf(display(bloodType2), bloodType2.getRhFactor(),bloodType2.getBloodType());
    }
    public static BloodData getData(BloodData b)
    {
        String bloodType;
        String rhFactor;

        // Assign a values for the variables
        bloodType = JOptionPane.showInputDialog(null, "Enter the blood type",
                                               "Blood Type", JOptionPane.PLAIN_MESSAGE
                                               );
        rhFactor = JOptionPane.showInputDialog(null, "Enter RH-Factor",
                                          "RH Factor", JOptionPane.PLAIN_MESSAGE
                                              );
        b.setBloodType(bloodType);
        b.setRhFactor(rhFactor);

        return b;

    }

    public static String display(BloodData b)
    {
        String str = "The patient has blood group %s%s\n.";
        return str;
    }

}

