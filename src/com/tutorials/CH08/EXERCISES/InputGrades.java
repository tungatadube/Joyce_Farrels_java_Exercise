package com.tutorials.CH08.EXERCISES;

import java.util.Scanner;

public class InputGrades
    /*
        Write an application that prompts a professor to enter grades for five different
        courses each for 10 students. Prompt the professor to enter data for one student at
        a time, including student ID and course data for five courses. Use prompts
        containing the number of the student whose data is being entered and the course
        number—for example, “Enter ID for student #s”, where s is an integer from 1
        through 10, indicating the student, and “Enter course ID #n”, where n is an integer
        from 1 through 5, indicating the course number. Verify that the professor enters
        only A, B, C, D, or F for the grade value for each course. Save the file as
        InputGrades.java.
     */

{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String [] courseid = {"SMA 120 II", "SMA 1102", "SCS 1101", "TIE 4702", "TIE 4809"};
        int [] creditHours = {3, 3, 2, 3, 2 };

        //promts
        String promptStudentNumber = "Enter ID for student #%s >>> \n. ";
        String promptSymbol = "Enter symbol for course #%s\n.";
        Student [] arrayOfStudents = new Student[10];

        // pupulate the array of students

        for(int x=0; x<arrayOfStudents.length; ++x)
        {
            arrayOfStudents[x] = new Student();
        }

        //Now let the prof give unique IDs to these ten students
        for(int x=0; x<arrayOfStudents.length; ++x)
        {
            System.out.printf(promptStudentNumber, x+1);
            String stdIdNum = keyboard.nextLine();
            arrayOfStudents[x].setStudentIdNumber(stdIdNum);

            for(int a=0; a<5; ++a)
            {
                arrayOfStudents[x].setCourses(new ColledgeCourse(), a);
                System.out.printf(promptSymbol, a+1);
                String symbol =  keyboard.nextLine();


               // use the setter methods to set these attributes for each student in the array of students//
               // automate the setting of these constant fields
               arrayOfStudents[x].colledgeCourse(a).setCourseID(courseid[a]);
               arrayOfStudents[x].colledgeCourse(a).setCreditHours(creditHours[a]);
               arrayOfStudents[x].colledgeCourse(a).setLetterGrade(symbol);

            }


        }

        displayData(arrayOfStudents[0]);
    }

    public static void displayData(Student std)
    {
        String displayStr = "You are viewing data for student %s, the student is enrolled for the  following courses." +
                            "\n%s with %s credit hours" +
                            ",\n%s with %s credit hours" +
                            ",\n%s with %s credit hours" +
                            ",\n%s with %s credit hours" +
                            ",\n%s with %s credit hours." +
                            "\n%s obtained the following grades: " +
                            " %s: %s\n" +
                            " %s: %s\n" +
                            " %s: %s\n" +
                            " %s: %s\n" +
                            " %s: %s.";
        System.out.printf(
                           displayStr
                           , std.getStudentIdNumber()
                           , std.colledgeCourse(0).getCourseID(), std.colledgeCourse(0).getCreditHours()
                           , std.colledgeCourse(1).getCourseID(), std.colledgeCourse(1).getCreditHours()
                           , std.colledgeCourse(2).getCourseID(), std.colledgeCourse(2).getCreditHours()
                           , std.colledgeCourse(3).getCourseID(), std.colledgeCourse(3).getCreditHours()
                           , std.colledgeCourse(4).getCourseID(), std.colledgeCourse(4).getCreditHours()
                           , std.getStudentIdNumber()
                           , std.colledgeCourse(0).getCourseID(), std.colledgeCourse(0).getLetterGrade()
                           , std.colledgeCourse(1).getCourseID(), std.colledgeCourse(1).getLetterGrade()
                           , std.colledgeCourse(2).getCourseID(), std.colledgeCourse(2).getLetterGrade()
                           , std.colledgeCourse(3).getCourseID(), std.colledgeCourse(3).getLetterGrade()
                           , std.colledgeCourse(4).getCourseID(), std.colledgeCourse(4).getLetterGrade()
                
                          );

    }
}
