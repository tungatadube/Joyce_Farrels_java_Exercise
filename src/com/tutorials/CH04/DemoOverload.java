package com.tutorials.CH04;

public class DemoOverload

    /*
                Open a new file in your text editor.
        2. Begin the following DemoOverload class with three integer variables to test the
        method and three calls to a displayDate() method:
        public class DemoOverload
        {
        public static void main(String[] args)
        (continues)
        Overloading a Method
        197
        Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part.
        Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
        Editorial review has deemed that any suppressed content does not materially affect the overall learning experience.
        engage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
        {
        int month = 6, day = 24, year = 2017;
        displayDate(month);
        displayDate(month, day);
        displayDate(month, day, year);
        }
        3. Create the following displayDate() method that requires one parameter
        to represent the month and uses default values for the day and year:
        public static void displayDate(int mm)
        {
        System.out.println("Event date " + mm + "/1/2016");
        }
        4. Create the following displayDate() method that requires two parameters
        to represent the month and day and uses a default value for the year:
        public static void displayDate(int mm, int dd)
        {
        System.out.println("Event date " + mm + "/" + dd + "/2016");
        }
        5. Create the following displayDate() method that requires three parameters
        used as the month, day, and year:
        public static void displayDate(int mm, int dd, int yy)
        {
        System.out.println("Event date " + mm + "/" + dd + "/" + yy);
        }
        6. Type the closing curly brace for the DemoOverload class.
        7. Save the file as DemoOverload.java.
        8. Compile the program, correct
        any errors, recompile if
        necessary, and then execute
        the program. Figure 4-19
        shows the output. Notice
        that whether you call the
        displayDate() method
        using one, two, or three
        arguments, the date is
        displayed correctly because
        you have successfully
        overloaded the displayDate()
        method
     */
{
    static public  void main(String[] args)
    {
       int month = 6, day = 24, year = 2017;
       displayDate(month);
       displayDate(month, day);
       displayDate(month, day, year );
    }

    public static void displayDate(int mm)
    {
        System.out.println("Event date " + mm +"/" + "1/2016");
    }

    public static void displayDate(int mm, int dd)
    {
        System.out.println("Event date " + mm + "/"+ dd + "/2016");
    }
    static public  void displayDate(int mm, int dd, int yy)
    {
        System.out.println("Event date " + mm + "/" + dd + "/" + yy);
    }
}
