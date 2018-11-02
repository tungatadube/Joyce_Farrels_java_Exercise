package com.tutorials.CH10;

public class PartyWithConstructor
{
    public PartyWithConstructor(int numGuests)
    {
        guests = numGuests;
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
