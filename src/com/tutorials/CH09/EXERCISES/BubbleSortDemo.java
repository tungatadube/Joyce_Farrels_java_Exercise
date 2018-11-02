package com.tutorials.CH09.EXERCISES;
import java.util.Scanner;

public class BubbleSortDemo
   /*
           Using a Bubble Sort
        In this section, you create a program in which you enter values that you sort using the
        bubble sort algorithm. You display the values during each iteration of the outer
        sorting loop so that you can track the values as they are repositioned in the array.
        1. Open a new file in your text editor, and create the shell for a BubbleSortDemo
        program as follows:
        (continues)
        Sorting Array Elements Using the Bubble Sort Algorithm
        445
        Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
        Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
        import java.util.*;
        class BubbleSortDemo
        {
        public static void main(String[] args)
        { }
        }
        2. Make some declarations between the curly braces of the main() method.
        Declare an array of five integers and a variable to control the number of
        comparisons to make during the sort. Declare a Scanner object, two integers
        to use as subscripts for handling the array, and a temporary integer value to
        use during the sort.
        int[] someNums = new int[5];
        int comparisonsToMake = someNums.length - 1;
        Scanner keyboard = new Scanner(System.in);
        int a, b, temp;
        3. Write a for loop that prompts the user for a value for each array element
        and accepts them.
        for(a = 0; a < someNums.length; ++a)
        {
        System.out.print("Enter number " + (a + 1) + " >> ");
        someNums[a] = keyboard.nextInt();
        }
        4. Next, call a method that accepts the array and the number of sort iterations
        performed so far, which is 0. The purpose of the method is to display the
        current status of the array as it is being sorted.
        display(someNums, 0);
        5. Add the nested loops that perform the sort. The outer loop controls
        the number of passes through the list, and the inner loop controls the
        comparisons on each pass through the list. When any two adjacent elements
        are out of order, they are swapped. At the end of the nested loop, the current
        list is output and the number of comparisons to be made on the next pass is
        reduced by one.
        for(a = 0; a < someNums.length - 1; ++a)
        {
        for(b = 0; b < comparisonsToMake; ++b)
        {
        (continued)
        (continues)
        C H A P T E R 9 Advanced Array Concepts
        446
        Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
        Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
        if(someNums[b] > someNums[b + 1])
        {
        temp = someNums[b];
        someNums[b] = someNums[b + 1];
        someNums[b + 1] = temp;
        }
        }
        display(someNums, (a + 1));
        −−comparisonsToMake;
        }
        6. After the closing brace for the main() method, but before the closing brace
        for the class, insert the display() method. It accepts the array and the
        current outer loop index, and it displays the array contents.
        public static void display(int[] someNums, int a)
        {
        System.out.print("Iteration " + a + ": ");
        for(int x = 0; x < someNums.length; ++x)
        System.out.print(someNums[x] + " ");
        System.out.println();
        }
        7. Save the file as BubbleSortDemo.java, and then compile and execute it.
        Figure 9-5 shows a typical execution. Notice that after the first iteration, the
        largest value has sunk to the bottom of the list. After the second iteration, the
        two largest values are at the bottom of the list, and so on.
        8. Modify the BubbleSortDemo application to any size array you choose. Confirm
        that no matter how many array elements you specify, the sorting algorithm
        works correctly and ends with a completely sorted list, regardless of the order
        of your entered values.
    */

{
    private static int [] arrayOfFiveIntegers = new int [5];
    public static void main(String[] args)
    {
      getAndSortData();


    }

    public static void getAndSortData()
    {

        Scanner keyboard = new Scanner(System.in);
        String prompt = "Enter five integers separated by commas >>>";
        System.out.println(prompt);
        String input = keyboard.nextLine();
        int comparisonsToMake = arrayOfFiveIntegers.length-1;

        // populate the array of ints

       String [] stringNums = input.split(",");

       for(int i=0; i<stringNums.length -1; ++i)
       {
           arrayOfFiveIntegers[i] = Integer.parseInt(stringNums[i]);
       }

        // sort the data
        for(int a = 0; a < arrayOfFiveIntegers.length-1; ++a)
        {
            for(int b = 0; b < comparisonsToMake; ++b)
            {

                if(arrayOfFiveIntegers[b]<arrayOfFiveIntegers[b+1])
                {
                    int temp = arrayOfFiveIntegers[b];
                    arrayOfFiveIntegers[b] = arrayOfFiveIntegers[b+1];
                    arrayOfFiveIntegers[b+1] = temp;

                 }

                display(arrayOfFiveIntegers, (a+1));
                System.out.println();
            }
            --comparisonsToMake;
        }



    }

    public static void display(int [] arr, int a)
    {
      String displayStr = "For pass #%s the array is as shown below:\n" +
                                "{%s, %s, %s, %s, %s}.\n"
                                ;
      System.out.printf(displayStr, a, arr[0],arr[1]
                              ,arr[2],arr[3]
                              ,arr[4]
                             );


    }
}
