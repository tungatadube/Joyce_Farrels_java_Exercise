package com.tutorials.CH10;

public class Party
{
    public Party()
    {

    }
    private  int guests;

    public int getGuests()
    {
        return guests;
    }

    public void setGuests(int guests)
    {
        this.guests = guests;
    }

    public void displayInvitation()
    {
        System.out.println("Please come to my party!");
    }
}
