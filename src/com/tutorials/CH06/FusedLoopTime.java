package com.tutorials.CH06;
import java.time.*;

public class FusedLoopTime

    /*
        Start a new application named TestFusedLoopTime.
import java.time.*;
public class TestFusedLoopTime
{
public static void main(String[] args)
{
2. Create variables to hold starting and ending times for loop execution. Also
declare a loop control variable, x, and two named constants that hold a number of
times to repeat loops and a factor for converting nanoseconds to milliseconds:
int startTime, endTime;
int x;
final int REPEAT = 5_000_000;
final int FACTOR = 1_000_000;
Recall that the underscore can be used to make long numbers easier to read.
The underscores could be omitted.
(continues)
Improving Loop Performance
339
Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
3. Declare a LocalDateTime object, initialize it to a starting time, and extract its
nanoseconds component.
LocalDateTime now;
now = LocalDateTime.now();
startTime = now.getNano();
4. In a loop that repeats 5 million times, call a method named method1(). When
the calls to method1() are complete, execute a second loop that also repeats
5 million times, calling another method named method2().
for(x = 0; x < REPEAT; ++x)
method1();
for(x = 0; x < REPEAT; ++x)
method2();
5. When both loops are finished, get the current time, extract the nanoseconds
value, and display the difference between the start time and end time,
expressed in milliseconds:
now = LocalDateTime.now();
endTime = now.getNano();
System.out.println("Time for loops executed separately: " +
((endTime - startTime) / FACTOR) + " milliseconds");
6. Get a new starting time, and call method1() and method2() 5 million times
each, blocked in a single loop.
now = LocalDateTime.now();
startTime = now.getNano();
for(x = 0; x < REPEAT; ++x)
{
method1();
method2();
}
7. Get the ending time for the loop, and display the value of the elapsed interval.
Add a closing curly brace for the method.
now = LocalDateTime.now();
endTime = now.getNano();
System.out.println("Time for loops executed in a block: " +
((endTime - startTime) / FACTOR) + " milliseconds");
}
(continued)
(continues)
C H A P T E R 6 Looping
340
Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
8. Create the two methods named method1() and method2(). Each is simply a
stub—a method that contains no statements. Add a closing curly brace for
the class.
public static void method1()
{}
public static void method2()
{}
}
9. Save the file as TestFusedLoopTime.java, and then compile and execute it.
Figure 6-33 shows a typical execution. The times might differ on your system,
but you should be able to see that using a single loop significantly improves
performance over using separate loops.
10. Experiment with increasing and decreasing the value of REPEAT, and observe
the effects. Experiment with adding statements to method1() and method2(),
perhaps including do-nothing loops within one or both of the methods. The
time values you observe might also differ when you run the program at
different times, depending on what other tasks are running on your system
concurrently.
     */

{
    public static void main(String[] arg)
    {
        int startTime;
        int endTime;
        int x;
        final int REPEAT = 5_000_000;
        final int FACTOR = 1_000_000;

        LocalDateTime now = LocalDateTime.now();
        startTime = now.getNano();

        for (x = 0; x < REPEAT; ++x)
        {
            method1();
        }for (x = 0; x < REPEAT; ++x)
        {
            method2();
        }


        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops when executed seperately: " + ((endTime-startTime)/FACTOR) + "milliseconds");
        now = LocalDateTime.now();
        startTime = now.getNano();

        for (x = 0; x < REPEAT; ++x)
        {
            method1();
            method2();
        }
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops when executed seperately: " + ((endTime-startTime)/FACTOR) + "milliseconds");


    }

    public static void method1()
    {

    }
    public static void method2()
    {

    }


}
