package com.tutorials.CH04;
import javax.swing.JOptionPane;
import java.time.*;
public class TimedResponse
    /*
                Open a new file in your text editor, and type the following two import
        statements. You need the JOptionPane class to use the showConfirmDialog()
        method, and you need the java.time package to use the LocalDateTime class:
        import javax.swing.JOptionPane;
        import java.time.*;
        2. Begin the TimedResponse application as follows. Declare two LocalDateTime
        objects named time1 and time2. These objects will hold the exact time before
        a user is prompted and the exact time after the user responds. Also declare
        integers to hold the value of the seconds for both times. The difference
        between these two values is the elapsed time between the creations of the
        two LocalDateTime values.
        public class TimedResponse
        {
        public static void main(String[] args)
        {
        LocalDateTime time1, time2;
        int seconds1, seconds2, difference;
        3. Assign the current time to the time1 object, and then extract the value of the
        current seconds field.
        time1 = LocalDateTime.now();
        seconds1 = time1.getSecond();
        4. Display a dialog box that asks the user to make a difficult choice.
        JOptionPane.showConfirmDialog
        (null, "Is stealing ever justified? ");
        (continued)
        (continues)
        C H A P T E R 4 More Object Concepts
        228
        Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
        Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
        5. Next, get the system time immediately after the user responds to the dialog
        box, and extract its seconds component.
        time2 = LocalDateTime.now();
        seconds2 = time2.getSecond();
        6. Compute the difference between the times, and display the result in a dialog box.
        difference = seconds2 - seconds1;
        JOptionPane.showMessageDialog(null, "End seconds: " + seconds2 +
        "\nStart seconds: " + seconds1 +
        "\nIt took " + difference + " seconds for you to answer");
        7. Add two closing curly braces—one for the method and the other for the
        class—and then save the file as TimedResponse.java.
        8. Compile and execute the program. When the question appears, ponder it for a
        few seconds, and then choose a response. Figure 4-41 shows a typical
        execution.
        9. The output in the TimedResponse application is accurate only when the first
        and second LocalDateTime objects are created during the same minute, as in
        the output in Figure 4-41, when the question was asked at 27 seconds after
        the minute and then answered 47 seconds after the same minute. If the first
        object is created 58 seconds after a minute starts and the user doesn’t
        respond to the question until 2 seconds after the next minute starts, the
        difference between the second values will be calculated incorrectly as –56
        instead of 4 seconds. On your own, modify the TimedResponse application to
        rectify this problem. Save the file as TimedResponse2.java.
     */

    {
        public static void main(String[] args)
        {
            LocalDateTime time1, time2;

            int seconds1, seconds2, difference;

            time1 = LocalDateTime.now();
            seconds1 = time1.getSecond();
            JOptionPane.showConfirmDialog(null, "Is stealiing ever justified?");

            time2 = LocalDateTime.now();
            seconds2 = time2.getSecond();
            difference = seconds2 - seconds1;
            JOptionPane.showMessageDialog(null, "End seconds: " + seconds2 + "\nStart seconds: "
                    + seconds1 + "\nIt took " + difference + " seconds for you to answer");

        }
    }

