package com.tutorials.CH04;

public class CreatePolicies
{
    public static void main(String[] args)
    {
        CarInsurancePolicy policyOne = new CarInsurancePolicy(123);
        CarInsurancePolicy policyTwo = new CarInsurancePolicy(456, 4);
        CarInsurancePolicy policyThree = new CarInsurancePolicy(789, 12, "Newcastle");
        policyOne.display();
        policyTwo.display();
        policyThree.display();
    }
}
