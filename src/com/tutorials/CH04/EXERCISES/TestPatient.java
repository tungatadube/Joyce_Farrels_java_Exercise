package com.tutorials.CH04.EXERCISES;

import javax.swing.*;

public class TestPatient
{
    /*
            a.  Create a class named BloodData that includes fields that hold a blood type (the
                four blood types are O, A, B, and AB) and an Rh factor (the factors are + and –).
                Create a default constructor that sets the fields to “O” and “+”, and an overloaded
                constructor that requires values for both fields. Include get and set methods for
                each field. Save this file as BloodData.java. Create an application named
                TestBloodData that demonstrates each method works correctly. Save the
                application as TestBloodData.java.
         */

    public static void main(String[] args) {
    // Instatiate two BloodData objects for testing the methods

        Patient patient0 = new Patient("06-2001837A-19", 30);
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();

       getData(patient2);
;

        System.out.printf(display(patient0), patient0.getIdNnumber(),patient0.getAge()
                          , patient0.bloodData.getBloodType(),patient0.bloodData.getRhFactor()
                          );
        System.out.printf(display(patient1), patient1.getIdNnumber(),patient1.getAge()
                          , patient1.bloodData.getBloodType(),patient1.bloodData.getRhFactor()
                         );
        System.out.printf(display(patient2), patient2.getIdNnumber(),patient2.getAge()
                          , patient2.bloodData.getBloodType(),patient2.bloodData.getRhFactor()
                         );
    }
    public static Patient getData(Patient p)
    {
        /*
        * This is the method being employed to get the patient data and assign it to the 
        * patient object p
        * @param - instatiated patient object
        *@return - Patient object with set methods
        */
        String idNumber;
        int age;

        // Assign a values for the variables
       idNumber = JOptionPane.showInputDialog(
                                              null
                                              , "Enter the patient ID."
                                              , "Patient Age", JOptionPane.PLAIN_MESSAGE
                                             );

        age = Integer.parseInt(
                               JOptionPane.showInputDialog(
                                                           null
                                                           ,"Enter patient's age."
                                                           ,"Age"
                                                           , JOptionPane.PLAIN_MESSAGE
                                                          )
                              );

        p.setIdNnumber(idNumber);
        p.setAge(age);

        return p;

    }

    public static String display(Patient p)
    {
        /*
        * Format a display string to communicate with user
        *
        *
        */
        String str = "Patient %s is %s years old and has blood group %s%s\n.";
        return str;
    }

}

