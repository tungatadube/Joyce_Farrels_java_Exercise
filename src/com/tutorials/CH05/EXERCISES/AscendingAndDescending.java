package com.tutorials.CH05.EXERCISES;
import java.util.Scanner;

public interface AscendingAndDescending

{
    public static void main(String[] args)
    {
        int val1;
        int val2;
        int val3;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an integer followed by a carriage return (Enter button) >>> ");
        val1 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter an integer followed by a carriage return (Enter button) >>> ");
        val2 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter an integer followed by a carriage return (Enter button) >>> ");
        val3 = keyboard.nextInt();
        keyboard.nextLine();

        //sort the values
        int  firstVal;
        int  secondVal;
        int  thirdVal;

        firstVal = (val1 < val2) ? val1 : val2;
        firstVal = (firstVal < val3) ? firstVal : val3;

        if (firstVal == val1)
        {
            secondVal = (val2 < val3) ? val2 : val3;
            if (secondVal == val2)
            {
                thirdVal = val3;
                String sortedDescending = "These are the values in descending order %s, %s, %s\n";
                String sortedAscending = "These are the values in ascending order %s, %s, %s\n";
                System.out.printf(sortedDescending, thirdVal, secondVal, firstVal );
                System.out.printf(sortedAscending, firstVal, secondVal, thirdVal );
            }
        }

        if (firstVal == val2)
        {
            secondVal = (val1 < val3) ? val1 : val3;
            if (secondVal == val1)
            {
                thirdVal = val3;
                String sortedDescending = "These are the values in descending order %s, %s, %s\n";
                String sortedAscending = "These are the values in ascending order %s, %s, %s\n";
                System.out.printf(sortedDescending, thirdVal, secondVal, firstVal );
                System.out.printf(sortedAscending, firstVal, secondVal, thirdVal );
            }
            else
            {
                thirdVal = val1;
                String sortedDescending = "These are the values in descending order %s, %s, %s\n";
                String sortedAscending = "These are the values in ascending order %s, %s, %s\n";
                System.out.printf(sortedDescending, thirdVal, secondVal, firstVal );
                System.out.printf(sortedAscending, firstVal, secondVal, thirdVal );
            }
        }

        if (firstVal == val3)
        {
            secondVal = (val1 < val2) ? val1 : val2;
            if (secondVal == val1)
            {
                thirdVal = val2;
                String sortedDescending = "These are the values in descending order %s, %s, %s\n";
                String sortedAscending = "These are the values in ascending order %s, %s, %s\n";
                System.out.printf(sortedDescending, thirdVal, secondVal, firstVal );
                System.out.printf(sortedAscending, firstVal, secondVal, thirdVal );
            }
            else
            {
                thirdVal = val1;
                String sortedDescending = "These are the values in descending order %s, %s, %s\n";
                String sortedAscending = "These are the values in ascending order %s, %s, %s\n";
                System.out.printf(sortedDescending, thirdVal, secondVal, firstVal );
                System.out.printf(sortedAscending, firstVal, secondVal, thirdVal );
            }
        }






    }
}
