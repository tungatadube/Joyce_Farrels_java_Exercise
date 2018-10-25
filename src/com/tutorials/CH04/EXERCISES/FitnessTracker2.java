package com.tutorials.CH04.EXERCISES;
import java.time.LocalDate;

public class FitnessTracker2
    /*
            Create a FitnessTracker class that includes data fields for a fitness activity, the
        number of minutes spent participating, and the date. The class includes methods
        to get each field. In addition, create a default constructor that automatically
        sets the activity to “running,” the minutes to 0, and the date to January 1 of the
        Exercises
        239
        Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
        Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
        current year. Save the file as FitnessTracker.java. Create an application that
        demonstrates each method works correctly, and save it as TestFitnessTracker.java.

        (b)Create an additional overloaded constructor for the FitnessTracker class you
        created in Exercise 3a. This constructor receives parameters for each of the data
        fields and assigns them appropriately. Add any needed statements to the
        TestFitnessTracker application to ensure that the overloaded constructor works
        correctly, save it, and then test it.

        (c) Modify the FitnessTracker class so that the default constructor calls the three parameter constructor.
            Save the class as FitnessTracker2.java. Create an application
            to test the new version of the class, and name it TestFitnessTracker2.java

      */
{
    public String fitnessActivity;
    public int numberOfMinutesSpentOnTheActivity;
    public String date;


    public FitnessTracker2()
    {
        this("running", 0, "1 January" + " " + LocalDate.now().getYear() );
    }

    public FitnessTracker2(String act, int nuMinutes, String dt )
    {
        fitnessActivity = act;
        numberOfMinutesSpentOnTheActivity = nuMinutes;
        date = dt +" " + LocalDate.now().getYear();
    }

    public String getFitnessActivity() {
        return fitnessActivity;
    }

    public void setFitnessActivity(String fitnessActivity) {
        this.fitnessActivity = fitnessActivity;
    }

    public int getNumberOfMinutesSpentOnTheActivity() {
        return numberOfMinutesSpentOnTheActivity;
    }

    public void setNumberOfMinutesSpentOnTheActivity(int numberOfMinutesSpentOnTheActivity) {
        this.numberOfMinutesSpentOnTheActivity = numberOfMinutesSpentOnTheActivity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
