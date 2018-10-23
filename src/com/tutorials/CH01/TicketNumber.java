package com.tutorials.CH01;

import javax.swing.JOptionPane;

public class TicketNumber
{

    public static void main(String[] args)
    {
        String ticketNumber = "154123";
        int remainingDigits = Integer.parseInt(ticketNumber.substring(0,5));
        int dropedDigit = Integer.parseInt(ticketNumber.substring(5));
        int remainder = remainingDigits % 7;

        if ((remainder) == dropedDigit)
        {
            JOptionPane.showMessageDialog(null, "true");
        }

       else
        {
            JOptionPane.showMessageDialog(null, "false");
        }
    }
}
