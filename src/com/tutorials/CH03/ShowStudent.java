package com.tutorials.CH03;
import java.util.Scanner;

public class ShowStudent

    /*
        (b) Write a class named ShowStudent that instantiates a Student object from the
            class you created and assign values to its fields. Compute the Student grade point
            average, and then display all the values associated with the Student. Save the
            application as ShowStudent.java.
     */

{
    public static void main(String[] args)

    {
        // instantiate the student object

        Student studentObj = new Student();

        // add unique attributes to this particular student you have created above

        studentObj = getData(studentObj);

        String str = studentObj.getIdNumber() + ", studied for a " + studentObj.getCreditHoursEarned()
                + "-credit-hour class" + " and obtained " + studentObj.getPointsEarned() + "points "
                + ". Their gpa for this course is thus " + studentObj.getGradePointAverage() + ".";

        System.out.println(str);
    }

    public static Student getData(Student s)
    {
        // declare the values you want to set (again??)

        String idNumber;
        double creditHoursEarned;
        int pointsEarned;
        double gradePointAverage;
        Scanner keyboard = new Scanner(System.in);

        // Create a container for your prompts

        String [] prompts = {"\t Please enter a value for the student's ID >>> ",
                             "\t Please enter a value for the student's credit hours >>> ",
                             "\t Please enter a value for the student's points"
                            };

        // now go ahead and prompt the user

        System.out.println(prompts[0]);
        idNumber = keyboard.nextLine();
        System.out.println(prompts[1]);
        creditHoursEarned = keyboard.nextDouble();
        System.out.println(prompts[2]);
        pointsEarned = keyboard.nextInt();
        gradePointAverage = Student.gpaCalculator(pointsEarned, creditHoursEarned);
        keyboard.nextLine();

        // now access the Student class's setters from your your instantiate object s

        s.setIdNumber(idNumber);
        s.setCreditHoursEarned(creditHoursEarned);
        s.setPointsEarned(pointsEarned);
        s.setGradePointAverage(gradePointAverage);

        // now return (into main) your created object Student with its unique attributes

        return s;
    }
}
