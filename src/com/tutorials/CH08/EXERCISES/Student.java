package com.tutorials.CH08.EXERCISES;

public class Student
       /*
        Create a CollegeCourse class. The class contains fields for the course ID (for
        example, “CIS 210”), credit hours (for example, 3), and a letter grade (for example, ‘A’).
        Include get and set methods for each field. Create a Student class containing an ID
        number and an array of five CollegeCourse objects. Create a get and set method
        for the Student ID number. Also create a get method that returns one of the
        Student’s CollegeCourses; the method takes an integer argument and returns
        the CollegeCourse in that position (0 through 4). Next, create a set method that
        sets the value of one of the Student’s CollegeCourses; the method takes two
        arguments—a CollegeCourse and an integer representing the CollegeCourse’s
        position (0 through 4). Save the files as CollegeCourse.java and Student.java.
     */
{
    private String studentIdNumber;
    private ColledgeCourse[] courses = new ColledgeCourse[5];

    public void setStudentIdNumber(String std)
    {
        studentIdNumber = std;
    }
    public String getStudentIdNumber()
    {
        return studentIdNumber;
    }

    public void setCourses(ColledgeCourse course, int pos) {
        courses[pos] = course;
    }
    public ColledgeCourse colledgeCourse(int pos)
    {return courses[pos];}
}
