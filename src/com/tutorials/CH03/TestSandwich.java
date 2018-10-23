package com.tutorials.CH03;
import  java.util.Scanner;
import com.tutorials.CH03.Sandwich;

public class TestSandwich
{




    /*
        Create an application named TestSandwich that instantiates one Sandwich object
        and demonstrates the use of the set and get methods. Save this application as
        TestSandwich.java.
     */

    public static void main(String[] args)
    {
        Sandwich sandwich = new Sandwich();

    // call a method that will set the fields for this newly created object

        sandwich = getData(sandwich); // by doing this setting here you avoid repetition of prompts if you call getData inside the println calls



        System.out.println("Summary for the sanguage you ordered." );
        System.out.println("Main Ingredient:" + "\n" + sandwich.getMainIngredient());
        System.out.println("Bread Type:" + "\n" + sandwich.getBreadType());
        System.out.println("Price:" + "\n" + Sandwich.currency[2] + sandwich.getPrice()); // using the public static variable currency from the imported Sandwhich class

    }

    // Create the method to get and set the data on the object

    public static Sandwich getData(Sandwich s)
    {
        String mainIngredient;
        String breadType;
        double price;
        Scanner keyboard = new Scanner(System.in);

        String [] prompts = {"Enter a value for the main ingredient >> ",
                             "Enter a value for the bread type >>>",
                             "Enter a value for the price >>> "

                            };

        System.out.println(prompts[0]);
        mainIngredient = keyboard.nextLine();

        System.out.println(prompts[1]);
        breadType = keyboard.nextLine();

        System.out.println(prompts[2]);
        price = keyboard.nextDouble();

        keyboard.nextLine(); // clear the keyboard buffer
//        keyboard.close(); // clear memory reference to the keyboard
        s.setMainIngredient(mainIngredient);
        s.setBreadType(breadType);
        s.setPrice(price);
        return s;
    }
}
