package com.tutorials.CH03;

public class PercentagesJava
    /*
    Create an application named Percentages whose main() method holds two
double variables. Assign values to the variables. Pass both variables to a method
named computePercent() that displays the two values and the value of the first
number as a percentage of the second one. For example, if the numbers are 2.0
and 5.0, the method should display a statement similar to “2.0 is 40 percent of 5.0.”
Then call the method a second time, passing the values in reverse order. Save the
application as Percentages.java.
b. Modify the Percentages class to accept the values of the two doubles from a user
at the keyboard. Save the file as Percentages2.java.
     */
{
    public static void main(String[] args)
    {
        double a = 57;
        double b = 78;

        System.out.println(computePercentage(a, b));
        System.out.println(computePercentage(b, a));
    }

    public static String computePercentage(double val1, double val2)
    {
        double percentage = (val1 / val2) * 100;
        String str = val1 + " is " + percentage
+ " percent of " + val2 + ".";
        return str;
    }
}
