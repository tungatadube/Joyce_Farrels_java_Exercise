package com.tutorials.CH01;

import javax.swing.JOptionPane;

public class ChiliToGoProfit
{
    public static void main(String[] args)
    {
        int adultMealPrice = 7;
        int childMealPrice = 4;
        double costOfAdultMeal = 4.35;
        double costOfChildMeal = 3.10;
        String numAdultMeals;
        String numChildMeals;
        String str;
        String totalPayable;
        double moneyAdultMeals;
        double moneyChildMeals;
        double totalMoney;
        char currency = '$';


        // get input
        numAdultMeals = JOptionPane.showInputDialog(null,
                "Enter the number of adult meals", "Adult Meals",JOptionPane.PLAIN_MESSAGE);
        numChildMeals = JOptionPane.showInputDialog(null,
                "Enter the number of child meals", "Child Meals",JOptionPane.PLAIN_MESSAGE);

        // process input

        int intnumAdultMeals = Integer.parseInt(numAdultMeals);
        int intnumChildMeals = Integer.parseInt(numChildMeals);

        moneyAdultMeals = adultMealPrice * intnumAdultMeals;
        moneyChildMeals = childMealPrice * intnumChildMeals;

        totalMoney = moneyAdultMeals + moneyChildMeals;

        // Display
        str = "You have ordered " + intnumAdultMeals + " adult meals at "
                + currency + adultMealPrice + " and "  + intnumChildMeals + " child meals at "
                + currency + childMealPrice +".";
        totalPayable = "The total payable amount is " + currency + "%.2f.\n";

        System.out.println(str);
        System.out.printf(totalPayable, totalMoney);

        // Calculating profit

        costOfAdultMeal = intnumAdultMeals * costOfAdultMeal;
        costOfChildMeal = intnumChildMeals * costOfChildMeal;

        double totalCostOfMeals = costOfAdultMeal + costOfChildMeal;
        double profit = totalMoney - totalCostOfMeals;

        // Display output

        System.out.printf("The profit for this transaction is "+ currency + "%.2f.", profit);







    }

}
