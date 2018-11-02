package com.tutorials.CH10;

public class DinnerPartyWithConstructor extends PartyWithConstructor
{
    public DinnerPartyWithConstructor(int numGuests)
    {
        super (numGuests);
    }

    private int dinnerChoice;

    public int getDinnerchoice()
    {
        return dinnerChoice;
    }

    public void setDinnerChoice(int choice)
    {
        dinnerChoice = choice;
    }
}
