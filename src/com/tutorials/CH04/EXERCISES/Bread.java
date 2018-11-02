package com.tutorials.CH04.EXERCISES;

public class Bread
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
    private String breadType;
    private String caloriesPerSlice;
    final public static String MOTTO = "The staff of life";

    public  Bread(String bType, String calsPerSlice)
    {
       this.breadType = bType;
       this.caloriesPerSlice = calsPerSlice;
    }



    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getCaloriesPerSlice() {
        return caloriesPerSlice;
    }

    public void setCaloriesPerSlice(String caloriesPerSlice) {
        this.caloriesPerSlice = caloriesPerSlice;
    }
}
