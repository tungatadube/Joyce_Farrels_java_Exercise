package com.tutorials.CH03;

import java.util.Scanner;


public class CreateSpaService
{

    public static void main(String[] args)
    {

        // Declare Objects

        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();

        firstService = getData(firstService);  // set the datafields here
        secondService = getData(secondService);



        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());




    }
    // This method returns a Spaservice object
    public static SpaService getData(SpaService s)
    {
        String service;
        Double price;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter service >>> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >>");
        price = keyboard.nextDouble();
        keyboard.nextLine(); // clear keyboard buffer
        s.setServiceDescription(service);
        s.setPrice(price);
        return s;
    }
}
