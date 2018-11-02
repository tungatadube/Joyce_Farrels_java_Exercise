package com.tutorials.CH04.EXERCISES;

import java.time.LocalDate;

public class Couple
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
    private String husbandFirstName;
    private String husbandLastName;
    private String wifesFirstName;
    private String wifesLastName;
    private LocalDate husbandsBirthday;
    private LocalDate wifesBirrthday;


    public Couple()
    {
        Person husband = new Person();
        Person wife = new Person();
        setHusbandFirstName(husband.getFirstName());
        setHusbandLastName(husband.getLastName());
        setWifesFirstName(wife.getFirstName());
        setWifesLastName(wife.getLastName());
        setHusbandsBirthday(husband.getBirthDate());
        setWifesBirrthday(wife.getBirthDate());
    }

    public String getHusbandFirstName() {
        return husbandFirstName;
    }

    public void setHusbandFirstName(String husbandFirstName) {
        this.husbandFirstName = husbandFirstName;
    }

    public String getHusbandLastName() {
        return husbandLastName;
    }

    public void setHusbandLastName(String husbandLastName) {
        this.husbandLastName = husbandLastName;
    }

    public String getWifesFirstName() {
        return wifesFirstName;
    }

    public void setWifesFirstName(String wifesFirstName) {
        this.wifesFirstName = wifesFirstName;
    }

    public String getWifesLastName() {
        return wifesLastName;
    }

    public void setWifesLastName(String wifesLastName) {
        this.wifesLastName = wifesLastName;
    }

    public LocalDate getHusbandsBirthday() {
        return husbandsBirthday;
    }

    public void setHusbandsBirthday(LocalDate husbandsBirthday) {
        this.husbandsBirthday = husbandsBirthday;
    }

    public LocalDate getWifesBirrthday() {
        return wifesBirrthday;
    }

    public void setWifesBirrthday(LocalDate wifesBirrthday) {
        this.wifesBirrthday = wifesBirrthday;
    }
}
