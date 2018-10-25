package com.tutorials.CH04.EXERCISES;

public class FormLetterWriter
    /*
                Create a class named FormLetterWriter that includes two overloaded methods
        named displaySalutation(). The first method takes one String parameter that
        represents a customer’s last name, and it displays the salutation “Dear Mr. or Ms.”
        followed by the last name. The second method accepts two String parameters that
        represent a first and last name, and it displays the greeting “Dear” followed by the first
        name, a space, and the last name. After each salutation, display the rest of a short
        business letter: “Thank you for your recent order.” Write a main() method that tests
        each overloaded method. Save the file as FormLetterWriter.java.
     */


{
    // format strings to be accessed by both methods
    public static String displaystr1 = "Dear Mr. or Ms. %s.\n";
    public static String displaystr2 = "Dear %s %s.\n";
    public static String lastName;
    public static String firstName;


    public static void main(String[] args)
    {
        displaySalutation("Dube");
        displaySalutation("Mduduzi", "Dube");
    }

    public static void displaySalutation(String lName)
    {
        lastName = lName;
        System.out.printf(displaystr1, lastName);
    }
    public static void displaySalutation(String fName, String lName)
    {
        firstName = fName;
        lastName = lName;
        System.out.printf(displaystr2, firstName, lastName);
    }

}
