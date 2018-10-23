package com.tutorials.CH03;

public class Sandwich
    /*
        Create a class named Sandwich. Data fields include a String for the main
        ingredient (such as “tuna”), a String for bread type (such as “wheat”), and a
        double for price (such as 4.99). Include methods to get and set values for each of
        these fields. Save the class as Sandwich.java.
     */

{
    private static String mainIngredient = "Tuna";
    private static String breadType = "Wheat";
    private static double price = 4.99;
    final public static String [] currency = {"$", "ZW", "ZAR", "BWP",};

    public static void setMainIngredient(String majorIngredient){mainIngredient = majorIngredient;}
    public static void setBreadType(String brType){breadType = brType;}
    public static void setPrice(Double prc){price = prc;}

    public static String getMainIngredient(){return mainIngredient;}
    public static String getBreadType() { return breadType;}
    public static double getPrice(){ return price;}


}
