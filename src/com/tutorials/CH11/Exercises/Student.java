package com.tutorials.CH11.Exercises;

public abstract class Student
{
    String studentId;
    String lastName;
    double annualTuition;

    public Student(String stdid, String lname)
    {
        studentId = stdid;
        lastName = lname;
    }

    public String getStudentId()
    {
        return studentId;
    }
    public String getLastName()
    {
        return lastName;
    }
    public abstract void setAnnualTuition();

       public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

}
