package com.tutorials.CH03;
import java.util.Scanner;

public class TestLease
{

    /*
        b. Create a class named TestLease whose main() method declares four Lease
        objects. Call a getData() method three times. Within the method, prompt a user
        for values for each field for a Lease, and return a Lease object to the main()
        method where it is assigned to one of main()’s Lease objects. Do not prompt the
        user for values for the fourth Lease object, but let it continue to hold the default
        values. Then, in main(), pass one of the Lease objects to a showValues() method
        that displays the data. Then call the addPetFee() method using the passed Lease
        object and confirm that the fee explanation statement is displayed. Next, call the
        showValues() method for the Lease object again and confirm that the pet fee has
        been added to the rent. Finally, call the showValues() method with each of the other
        three objects; confirm that two hold the values you supplied as input and one holds
        the constructor default values. Save the application as TestLease.java.
        Debugging Exercises
     */





    public static void main(String[] args)

    {
        Lease tenant1 = new Lease();
        Lease tenant2 = new Lease();
        Lease tenant3 = new Lease();
        Lease tenant4 = new Lease();

        getData(tenant1);
        getData(tenant2);
        getData(tenant3);
        //getData(tenant4);

        showValues(tenant1);
        showValues(tenant2);
        showValues(tenant3);
        showValues(tenant4);




    }

    public static void showValues(Lease t)
    {
        String  displayString = "\tHello %s, of apartment %s. The rent due for this month is %s%s ." +
                                " Because you have a pet we normally %s.\n\tThe amount due is therefore:\n\t%s%s.\n";
        System.out.printf(displayString,
                          t.getName(),
                          t.getApartmentNumber(),
                          t.currency[0],
                          t.getRent(),
                          t.petFee(),
                          t.currency[0],
                          t.getRent()
                          );
    }

    public static Lease getData(Lease t)
    {
        String name;
        int apartmentNumber;
        int rent;
        int term;
        Scanner keyboard = new Scanner(System.in);
        String [] prompts = {"Enter  value of the tenant name >>> ",
                             "Enter a value for the apartment number >>> ",
                             "Enter a value for the rent >>> ",
                             "Enter a value for the term >>> ", };
        System.out.println(prompts[0]);
        name = keyboard.nextLine();
        System.out.println(prompts[1]);
        apartmentNumber = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println(prompts[2]);
        rent = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println(prompts[3]);
        term = keyboard.nextInt();
        keyboard.nextLine();

        t.setName(name);
        t.setApartmentNumber(apartmentNumber);
        t.setRent(rent);
        t.setTerm(term);

        return t;


    }
}

