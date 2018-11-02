package com.tutorials.CH04.EXERCISES;

public class TestWedding

     /*
        Create a class named Person that holds the following fields: two String objects
        for the person’s first and last name and a LocalDate object for the person’s
        birthdate. Create a class named Couple that contains two Person objects. Create
        a class named Wedding for a wedding planner that includes the date of the wedding,
        the names of the Couple being married, and a String for the location. Provide
        constructors for each class that accept parameters for each field, and provide
        get methods for each field. Then write a program that creates two Wedding objects
        and in turn passes each to a method that displays all the details. Save the files
        as Person.java, Couple.java, Wedding.java, and TestWedding.java.
     */

{
    public static void main(String[] args)

    {
        Couple couple0 = new Couple();
        String coupleName = couple0.getHusbandLastName();
        Wedding wedding0 = new Wedding("2015-01-01", coupleName, "Ilanda gardens");
        Wedding wedding1 = new Wedding ("1916-04-05", coupleName, "Nesbitt Castle");

//        Couple couple1 = new Couple();

        System.out.printf(
                          displayWeddingDetails(wedding0)
                                                        , couple0.getHusbandFirstName()
                                                        , couple0.getHusbandLastName()
                                                        , couple0.getHusbandsBirthday()
                                                        , couple0.getWifesFirstName()
                                                        , couple0.getWifesLastName()
                                                        , couple0.getWifesBirrthday()
                                                        , wedding0.getNameOfTheCouple()
                                                        , wedding0.getWeddingDate()
                                                        , wedding0.getLocation()                
                         );
    }

    public static String displayWeddingDetails(Wedding wed)
    {
        String particularsAndWeddingInfo = "Mr %s %s born on %s is getting married to %s %s born on %s." + 
                                           "\nThe wedding for the %s's falls on %s and the venue is %s.";
        return particularsAndWeddingInfo;
    }
}
