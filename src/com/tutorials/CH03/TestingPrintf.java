package com.tutorials.CH03;

public class TestingPrintf
{

    public static int a = 5;
    public static int b = 6;
    public static String ncoe = "Lalala";

    public static void main(String[] args)
    {
        String displayStr = "The value of a is %s, that of b is %s and that of Mr Ncoe is %s.";
        System.out.printf(displayStr, a, b, ncoe);
    }
}
