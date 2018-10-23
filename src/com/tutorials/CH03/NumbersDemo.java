package com.tutorials.CH03;

import java.util.Scanner;

/*
a. Create an application named NumbersDemo whose main() method holds two
integer variables. Assign values to the variables. In turn, pass each value to
methods named displayTwiceTheNumber(), displayNumberPlusFive(), and
displayNumberSquared(). Create each method to perform the task its name
implies. Save the application as NumbersDemo.java.
b. Modify the NumbersDemo class to accept the values of the two integers from a user
at the keyboard. Save the file as NumbersDemo2.java.
 */

public class NumbersDemo
{




    public static void main(String[] args)
    {
        int a;
        int b;

        System.out.println("Enter a value for the first variable >> ");
        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter a value for the second variable >> ");
        b = keyboard.nextInt();
        keyboard.nextLine();






        System.out.println(displayTwiceTheNumber(a));
        System.out.println(displayTwiceTheNumber(b));
        System.out.println(displayNumberPlusFive(a));
        System.out.println(displayNumberPlusFive(b));
        System.out.println(displayNumberSquared(a));
        System.out.println(displayNumberSquared(b));




    }

    public static int displayTwiceTheNumber(int a)
    {
        return 2 * a;
    }
    public static int displayNumberPlusFive(int a)
    {
        return a + 5;
    }
    public static int displayNumberSquared(int a)
    {
        return a*a;

    }



}
