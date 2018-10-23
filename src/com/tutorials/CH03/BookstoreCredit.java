package com.tutorials.CH03;

import java.util.Scanner;

public class BookstoreCredit

    /*
    To encourage good grades, Hermosa High School has decided to award each student
a bookstore credit that is 10 times the student’s grade point average. In other words, a
student with a 3.2 grade point average receives a $32 credit. Create a class that
prompts a student for a name and grade point average, and then passes the values to a
method that displays a descriptive message. The message uses the student’s name,
echoes the grade point average, and computes and displays the credit. Save the
application as BookstoreCredit.java.
     */
{
    public static void main(String[] args)
    {
       getandDisplayInfo();
    }

    public static void getandDisplayInfo()
    {
        String name;
        Double gpaScore;


        System.out.println("Enter a value for the first variable >> ");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();


        System.out.println("Enter a value for the second variable >> ");
        gpaScore = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print(displayStudentInfo(name, gpaScore));
    }

    public static String displayStudentInfo(String name, double gpa)
    {
        String str;
        double credit = gpa * 10;
        char currency = '$';

        str = name + " obtained a grade point average score of " + gpa
                + ", their library credit is " + currency + credit + ".";
        return str;
    }
}
