package com.tutorials.CH04.EXERCISES;

import javax.swing.*;

public class Patient

    /*
        Create a class named Patient that includes an ID number, age, and BloodData.
        Provide a default constructor that sets the ID number to “0”, the age to 0, and the
        BloodData to “O” and “+”. Create an overloaded constructor that provides values
        for each field. Also provide get methods for each field. Save the file as Patient.java.
        Create an application that demonstrates that each method works correctly, and
        save it as TestPatient.java.
   */

{
    private String idNnumber;
    private int age;
    BloodData bloodData;

    public Patient()
    {
       setIdNnumber("999");
       setAge(999);
       bloodData = new BloodData();

    }

    public Patient(String idNum, int ag )
    {
       setIdNnumber(idNum);
       setAge(ag);
       String Bgrp = JOptionPane.showInputDialog(
                                 null
                                                 ,"Enter your Patient's Blood group"
                                                 ,"Blood Group"
                                                 , JOptionPane.PLAIN_MESSAGE
                                                );
       bloodData = new BloodData(
                                 Character.toString(Bgrp.charAt(0))
                                 ,Character.toString(Bgrp.charAt(1))
                                );

    }

    public String getIdNnumber() {
        return idNnumber;
    }

    public void setIdNnumber(String idNnumber) {
        this.idNnumber = idNnumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
