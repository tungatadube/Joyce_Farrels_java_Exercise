package com.tutorials.CH11.Exercises;
import java.util.Scanner;

public class StudentDemo
{
    public static void main(String[] args)
    {
        Student[] refStudent = new Student[6];
        refStudent[0] = new UndergraduateStudent();
        refStudent[1] = new UndergraduateStudent();
        refStudent[2] = new StudentAtLarge();
        refStudent[3] = new StudentAtLarge();
        refStudent[4] = new GraduateStudent();
        refStudent[5] = new GraduateStudent();
        for(Student item : refStudent)
        {
            getData(item);
            displayData(item);
        }

    }


    public static void getData(Student std)
    {
            Scanner keyboard = new Scanner(System.in);
            String promptID = "Enter the student ID for this student >> ";
            System.out.println(promptID);
            String idnum = keyboard.nextLine();
            String promptLname = "Enter the lastname for this student >>> ";
            System.out.println(promptLname);
            String lname = keyboard.nextLine();
            std.setStudentId(idnum);
            std.setLastName(lname);
            std.setAnnualTuition();



    }
    public static void displayData(Student std)
    {
        System.out.println("Student " + std.getLastName() + " Id number " + std.getStudentId() +" pays $" + std.annualTuition + " worth of yearly tuition." );

    }
}
