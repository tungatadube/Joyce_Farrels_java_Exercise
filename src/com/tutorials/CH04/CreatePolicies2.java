package com.tutorials.CH04;

public class CreatePolicies2
{
    public static void main(String[] args)
    {
        CarInsurancePolicy2 policyOne = new CarInsurancePolicy2(123);
        CarInsurancePolicy2 policyTwo = new CarInsurancePolicy2(456, 4);
        CarInsurancePolicy2 policyThree = new CarInsurancePolicy2(789, 12, "Newcastle");
        policyOne.display();
        policyTwo.display();
        policyThree.display();
    }
}
