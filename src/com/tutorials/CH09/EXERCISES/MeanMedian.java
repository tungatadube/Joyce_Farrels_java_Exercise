package com.tutorials.CH09.EXERCISES;
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian
{




    public static void main(String[] args)
    {
        getData();
        display();

    }

    public static void getData()
    {
        Scanner keyboard = new Scanner(System.in);
        String inputNums;
        System.out.print("Enter your integers separated by commas >>>");
        inputNums = keyboard.nextLine();
        int count;
        int sum;

        if (inputNums.length() > 1)
        {
            String [] arrayOfStringnums = inputNums.split(",");
            int [] arrayOfintNums = new int [arrayOfStringnums.length];
            for (int x=0; x<arrayOfintNums.length; ++x)
            {
                arrayOfintNums[x] = Integer.parseInt(arrayOfStringnums[x]);
            }
            System.out.print("The received numbers are \n" + inputNums + "\n");
            System.out.println("The sorted array is as displayed below:\n");
            System.out.print("{ ");
            Arrays.sort(arrayOfintNums);
            for (int x = 0; x <arrayOfintNums.length - 1; ++x)
                System.out.print(arrayOfintNums[x] + ", ");
            System.out.print("}\n");

            double mean;
            int median;
            count = arrayOfintNums.length;
            mean = sum(arrayOfintNums)/count;

            if( count % 2 != 0)
            {
                median = arrayOfintNums[(int) (count/2 + 1)];
            }
            else
                median = (int) (arrayOfintNums  [(int) count/2 - 1] + arrayOfintNums[(int) count/2 - 1])/2;

            System.out.printf("For this array the mean is %s, while the median is %s", mean, median);

        }

        else
        {
            JOptionPane.showMessageDialog(null, "Please enter comma separated integers"
                                          , "Not allowed", 1);

        }

    }
    public static void display()
    {

    }

    public static int sum(int [] a)
    {
        int sum = 0;
        for(int x=0; x < a.length-1; ++x)
        {

            sum += a[x];

        }
        return sum;
    }


}
