package com.tutorials;

import java.io.Serializable;

public class EmployeeBean implements Serializable
{
    private String firstName;
    private String lastName;
    private int startYear;
    private int payRate;

public EmployeeBean()
{

}
    public void setFirstName(String firstName){ this.firstName = firstName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
    public void setStartYear(int startYear){ this.startYear = startYear; }
    public void setPayRate(int payRate){ this.payRate = payRate; }
    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
    public int getStartYear(){ return startYear; }
    public int payRate(){ return payRate; }
}
