package com.tutorials.CH10;

import java.util.Scanner;

public class UseDinnerPartyWithParameters
{
    public static void main(String[] args)
    {
        int guests;
        int choice;
        Party aParty = new Party();
        DinnerPartyWithConstructor aDinnerParty = new DinnerPartyWithConstructor(23);
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the number of guests for the party >> ");
        guests = keyboard.nextInt();
        keyboard.nextLine();
        aParty.setGuests(guests);
        System.out.println("The party has " + aParty.getGuests() + " guests");
        aParty.displayInvitation();
        System.out.print("Enter the number of guests for the dinner party >> ");
        guests = keyboard.nextInt();
        keyboard.nextLine();
        aDinnerParty.setGuests(guests);
        System.out.print("Enter the menu option --1 for chicken or 2 for beef >>> ");
        choice = keyboard.nextInt();
        keyboard.nextLine();
        aDinnerParty.setDinnerChoice(choice);
        System.out.println("Menu option " + aDinnerParty.getDinnerchoice() + " will be served");
        aDinnerParty.displayInvitation();

    }
}
