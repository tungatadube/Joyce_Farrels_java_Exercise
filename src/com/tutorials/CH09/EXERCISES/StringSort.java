package com.tutorials.CH09.EXERCISES;
import java.util.*;

public class StringSort
{
    /*
        Write an application containing an array of 20 String values, and display them in
        ascending order. Save the file as StringSort.java.
     */
    public static void main(String ... args)

    {
        String [] ArrayofStrings = {"Mduduzi", "Ncominkosi", "Michael", "Ongai", "Sis Noe", "Mandloe"
                , "Thatie", "Mantax", "Mpho", "Given", "Gre", "Mama", "Yellow"
                , "Henry", "Nhlanhla", "Madlamin", "Ko", "Mthandazo", "Claudia", "Madawu"};
        Arrays.sort(ArrayofStrings);
        System.out.print("{ ");
        for (int x = 0; x <ArrayofStrings.length - 1; ++x)
        System.out.print(ArrayofStrings[x] + ", ");
        System.out.print("}");
    }


}
