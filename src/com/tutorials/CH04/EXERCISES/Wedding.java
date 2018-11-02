package com.tutorials.CH04.EXERCISES;

import java.time.LocalDate;

public class Wedding
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
    private LocalDate weddingDate;
    private  String nameOfTheCouple;
    private String location;

    public Wedding(String weddate, String nam, String loc)
    {
        LocalDate weddingdte = LocalDate.parse(weddate);
        this.weddingDate = weddingdte;
        this.nameOfTheCouple = nam;
        this.location = loc;
    }

    public LocalDate getWeddingDate() {
        return weddingDate;
    }

    public void setWeddingDate(LocalDate weddingDate) {
        this.weddingDate = weddingDate;
    }

    public String getNameOfTheCouple() {
        return nameOfTheCouple;
    }

    public void setNameOfTheCouple(String nameOfTheCouple) {
        this.nameOfTheCouple = nameOfTheCouple;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
