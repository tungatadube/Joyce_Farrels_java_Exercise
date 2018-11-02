package com.tutorials.CH09;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;


public class TwoDimmensionalArrayDemo

    /*
        Open a new file in your text editor, and start a class that will demonstrate
        a working two-dimensional array:
        import java.util.Scanner;
        class TwoDimensionalArrayDemo
        {
        public static void main(String[] args)
        {
        (continues)
        Using Two-Dimensional and Other Multidimensional Arrays
        457
        Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
        Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
        2. Declare a three-by-three array of integers. By default, the elements will all be
        initialized to 0.
        int[][] count = new int[3][3];
        3. Declare a Scanner object for input, variables to hold a row and column,
        and a constant that can be used to indicate when the user wants to quit
        the application.
        Scanner input = new Scanner(System.in);
        int row, column;
        final int QUIT = 99;
        4. Prompt the user to enter a row or the QUIT value to quit, then accept the
        user’s input.
        System.out.print("Enter a row or " + QUIT +
        " to quit > ");
        row = input.nextInt();
        5. In a loop that continues if the user has not entered the QUIT value, prompt the
        user for a column. If the row and column are both within appropriate ranges,
        add 1 to the element in the selected position.
        while(row != QUIT)
        {
        System.out.print("Enter a column > ");
        column = input.nextInt();
        if(row < count.length && column < count[row].length)
        {
        count[row][column]++;
        6. Still within the if statement that checks for a valid row and column, add a
        nested loop that displays each row and column of the newly incremented
        array. The elements in each row are displayed on the same line, and a new
        line is started at the end of each row. Add a closing curly brace for the
        if statement.
        for(int r = 0; r < count.length; ++r)
        {
        for(int c = 0; c < count[r].length; ++c)
        System.out.print(count[r][c] + " ");
        System.out.println();
        }
        }
        7. Add an else clause to the if statement to display an error message when the
        row or column value is too high.
        else
        System.out.println("Invalid position selected");
        (continued)
        (continues)
        C H A P T E R 9 Advanced Array Concepts
        458
        Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
        Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
        8. At the end of the loop, prompt the user for and accept the next row number.
        Add closing curly braces for the loop, the main() method, and the class.
        System.out.print("Enter a row or " + QUIT +
        " to quit > ");
        row = input.nextInt();
        }
        }
        }
        9. Save the file as TwoDimensionalArrayDemo.java. Compile and execute
        the program. Figure 9-14 shows a typical execution. As the user continues to
        enter row and column values, the appropriate elements in the array are
        incremented.
     */

{
    public static void main(String[] args)
    {
        int [][] count = new int [3][3];
        Scanner input = new Scanner(System.in);
        int row;
        int column;
        final int QUIT = 99;

        System.out.println("Enter a row " + QUIT + " to quit >> ");
        row = input.nextInt();

        while (row != QUIT)
        {
            input.nextLine();
            System.out.print("Enter a column > ");
            column = input.nextInt();
            if((row < count.length) && (column < count[row].length))
            {
                count[row][column]++;
                for(int r = 0; r < count.length;++r)
                {
                    for (int c = 0; c < count[r].length; ++c)
                    {
                        System.out.print(count[r][c] + " ");
                    }
                    System.out.println();

                }

            }
            else
            {
                System.out.println("Invalid position selected");
            }
            input.nextLine();
            System.out.print("Enter a row or " + QUIT + " to quit > ");
            row = input.nextInt();
        }



    }
}
