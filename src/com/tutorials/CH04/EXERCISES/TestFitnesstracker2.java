package com.tutorials.CH04.EXERCISES;

import javax.swing.*;
import java.time.LocalDate;

public class TestFitnesstracker2
{
    public static void main(String[] args)
    {
        // instantiate two objects to use for testing the
        FitnessTracker2 activity = new FitnessTracker2();
        FitnessTracker2 activity2 = new FitnessTracker2("running", 45, "August 8" );
        getData(activity);
        System.out.printf(
                        displayInfo(activity), activity.getFitnessActivity(), activity.getDate()
                          ,activity.getNumberOfMinutesSpentOnTheActivity()
                         );
        System.out.printf(displayInfo(activity2), activity2.getFitnessActivity()
                         , activity2.getDate(), activity2.getNumberOfMinutesSpentOnTheActivity()
                         );


    }

    public static FitnessTracker2 getData(FitnessTracker2 a)
    {
        String fitnessActivity;
        int numberOfMinutesSpentOnTheActivity;
        String date;

        fitnessActivity = JOptionPane.showInputDialog(
                                                      null,
                                                      "Enter the name of the activity you are embarking on."
                                                       , "Activity", JOptionPane.PLAIN_MESSAGE
                                                     );
        
        numberOfMinutesSpentOnTheActivity = Integer.parseInt(JOptionPane.showInputDialog(null
                                                             ,"Enter the number of minutes spent on the activity"
                                                             , "Number of minutes", JOptionPane.PLAIN_MESSAGE)
                                                            );

        date = JOptionPane.showInputDialog(null, "Enter the month and day of doing the activity."
                                          ,"Month and day of activity", JOptionPane.PLAIN_MESSAGE
                                          ) + " " + LocalDate.now().getYear();

        a.setFitnessActivity(fitnessActivity);
        a.setNumberOfMinutesSpentOnTheActivity(numberOfMinutesSpentOnTheActivity);
        a.setDate(date);

        return a;

    }
    public static String displayInfo(FitnessTracker2 a)
    {
         String str = "You started %s on %s. You spent %s minutes on this activity\n";
         return str;



    }
}
