package com.tutorials.CH01;

public class MinutesConversion
{
    public static void main(String[] args)
    {
        int minutes = 178300;
        double hours;
        double days;
        String displayStringDays = "There are %.2f days in this timeframe.";
        String displayStringhours = "There are %.2f hours in this timeframe.";

        hours = minutes / 60;
        days = minutes / (24 * 60);

        System.out.printf(displayStringhours, hours);
        System.out.println();
        System.out.printf(displayStringDays, days);

    }
}
