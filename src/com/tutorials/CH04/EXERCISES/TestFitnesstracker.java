package com.tutorials.CH04.EXERCISES;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;
import java.time.LocalDate;

public class TestFitnesstracker
{
    public static void main(String[] args)
    {
        // instantiate two objects to use for testing the
        FitnessTracker activity = new FitnessTracker();
        FitnessTracker activity2 = new FitnessTracker("running", 45, "August 8" );
        getData(activity);
        System.out.printf(
                        displayInfo(activity), activity.getFitnessActivity(), activity.getDate()
                          ,activity.getNumberOfMinutesSpentOnTheActivity()
                         );
        System.out.printf(displayInfo(activity2), activity2.getFitnessActivity()
                         , activity2.getDate(), activity2.getNumberOfMinutesSpentOnTheActivity()
                         );


    }

    public static FitnessTracker getData(FitnessTracker a)
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
    public static String displayInfo(FitnessTracker a)
    {
         String str = "You started %s on %s. You spent %s minutes on this activity\n";
         return str;



    }
}
