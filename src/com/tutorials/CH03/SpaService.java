package com.tutorials.CH03;

public class SpaService


{
    public SpaService()
    {
        serviceDescription = "XXXXX";
        price = 0.00;
    }
    //data fields
    /* these are set private in order for them not to be easily accessible from outside the class.
    */
    private String serviceDescription;
    private double price;

    // setting the field values
    /*
    Methods are used to set the data for these variables, the advantage being that additional steps can be taken
    to make sure this data is specifically tailored for use with these variables
    
    */

    public void setServiceDescription(String service)
    {
        serviceDescription = service;

    }

    public void setPrice(double pr)
    {
        price = pr;

    }

    // retrieving the field values

    public String getServiceDescription()
    {
        return serviceDescription;
    }

    public double getPrice()
    {
        return price;
    }

}
