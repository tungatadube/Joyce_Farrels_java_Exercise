package com.tutorials.CH04.EXERCISES;

import javax.swing.*;
import java.time.LocalDate;

public class Person
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
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person()
    {
        firstName = JOptionPane.showInputDialog(
                                                null
                                                ,"Enter the first name."
                                                ,"First name"
                                                ,1
                                                );
                                                
        lastName = JOptionPane.showInputDialog(
                                                null
                                                ,"Enter the last name."
                                                ,"Last Name"
                                                ,1
                                                );
        birthDate = LocalDate.parse(
                                    JOptionPane.showInputDialog(
                                                                null
                                                                ,"Enter a string for the birthday."
                                                                ,"Birthday"
                                                                ,1
                                                                )
                                    );
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
