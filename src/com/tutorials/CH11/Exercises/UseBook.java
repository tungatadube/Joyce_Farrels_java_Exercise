package com.tutorials.CH11.Exercises;
import java.util.Scanner;

public class UseBook

{


    public static void main(String[] args)
    {
        Fiction book1 = new Fiction();
        NonFiction book2 = new NonFiction();
        getInfoFiction(book1);
        getInfoNonFiction(book2);
        String displayStr1 = "From the %s category you selected, one book titled %s, the price for the book is $%s";
        String displayStr = String.format(displayStr1, "Friction", book1.getTitle(), book1.getPrice());
        System.out.println(displayStr);
        displayStr = String.format(displayStr1, "Non-Friction", book2.getTitle(), book2.getPrice());
        System.out.println(displayStr);


    }

    public static Fiction getInfoFiction(Fiction b)
    {
        double prc;
        Scanner keyboard  = new Scanner(System.in);
        System.out.println("Enter the price for your first book >>> ");
        prc = keyboard.nextDouble();
        b.setPrice(prc);
        return b;

    }

    public static NonFiction getInfoNonFiction(NonFiction b)
    {
        double prc;
        Scanner keyboard  = new Scanner(System.in);
        System.out.println("Enter the price for the second book >>> ");
        prc = keyboard.nextDouble();
        b.setPrice(prc);
        return b;
    }

}
