package com.tutorials.CH04.EXERCISES;

import javax.swing.*;

public class TestBread
    /*
        Create a class for the Tip Top Bakery named Bread with data fields for bread type
        (such as “rye”) and calories per slice. Include a constructor that takes parameters
        for each field, and include get methods that return the values of the fields. Also
        include a public final static String named MOTTO and initialize it to The staff of
        life. Write an application named TestBread to instantiate three Bread objects with
        different values, and then display all the data, including the motto, for each object.
        Save both the Bread.java and TestBread.java files.
     */

{
    public static void main(String[] args)
    {
        Bread breadType0 = new Bread("Whole Wheat", "500");
        Bread breadType1 = new Bread("High Fiber", "500");
        getData(breadType0);
        System.out.printf(
                          displayBreadType(breadType0)
                          , breadType0.getBreadType()
                          , breadType0.getCaloriesPerSlice()
                         );

        System.out.printf(
                          displayBreadType(breadType1)
                          , breadType1.getBreadType()
                          , breadType1.getCaloriesPerSlice()
                        );
       
    }
    public static Bread getData(Bread b)
    {
        String breadType;
        String caloriesPerSlice;

        breadType = JOptionPane.showInputDialog(
                                                null,
                                                "Enter the bread Type."
                                                , "Bread Type"
                                                ,JOptionPane.PLAIN_MESSAGE
                                                );
        caloriesPerSlice = JOptionPane.showInputDialog(
                                                null,
                                                "Enter the calories per slice."
                                                , "Calories per slice"
                                                ,JOptionPane.PLAIN_MESSAGE
                                                );
        b.setBreadType(breadType);
        b.setCaloriesPerSlice(caloriesPerSlice);

        return b;

    }
    public static String displayBreadType(Bread b)
    {
       String displaystr = "You purchased %s bread, the calories per slice for this kind of bread are at %s cals per slice.\n";
       return displaystr;
    }


}
