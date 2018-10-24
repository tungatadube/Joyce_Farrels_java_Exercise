package com.tutorials.CH04;



public class CarInsurancePolicy2
    /*
        Using the this Reference to Make Constructors More Efficient
        In this section, you modify the CarInsurancePolicy class so that its constructors are
        more efficient.
        1. Open the CarInsurancePolicy.java file. Change the class name
        to CarInsurancePolicy2, and immediately save the file as
        CarInsurancePolicy2.java.
        2. Change the name of the three-parameter constructor from
        CarInsurancePolicy() to CarInsurancePolicy2().
        3. Replace the constructor that accepts a single parameter for the policy
        number with the following constructor. The name of the constructor is
        changed from the earlier version, and this one passes the policy number
        and two constant values to the three-parameter constructor:
        public CarInsurancePolicy2(int num)
        {
        this(num, 2, "Mayfield");
        }
        (continues)
        C H A P T E R 4 More Object Concepts
        212
        Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
        Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
        4. Replace the constructor that accepts two parameters (for the policy number
        and number of payments) with the following constructor. This constructor has
        a new name and passes the two parameters and one constant value to the
        three-parameter constructor:
        public CarInsurancePolicy2(int num, int payments)
        {
        this(num, payments, "Mayfield");
        }
        5. Save the file, and compile it.
        6. Open the CreatePolicies.java file that demonstrates the use of the different
        constructor versions. Change the class name to CreatePolicies2, and save
        the file as CreatePolicies2.java.
        7. Add the digit 2 in six places—three times to change the class name
        CarInsurancePolicy to CarInsurancePolicy2 when the name is used as
        a data type, and in the three constructor calls.
        8. Save the file, and then compile and execute it. The output is identical to that
        shown in Figure 4-23 in the previous “You Do It” section, but the repetitious
        constructor code has been eliminated.
        9. You can further reduce the code in the CarInsurancePolicy class by changing the single-parameter constructor to the following, which removes the
        constant "Mayfield" from the constructor call:
        public CarInsurancePolicy2(int num)
        {
        this(num, 2);
        }
        Now, the single-parameter version calls the two-parameter version and
        passes the policy number and the constant 2. In turn, the two-parameter
        version calls the three-parameter version, adding "Mayfield" as the city.
        10. Save this version of the CarInsurancePolicy2 class, and compile it. Then recompile the CreatePolicies2.java file, and execute it. The output remains the same.
     */

{
    private int policyNumber;
    private int numPayments;
    private String residentCity;

    public CarInsurancePolicy2(int num, int payments, String city)
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;


    }

    public CarInsurancePolicy2(int num, int payments)
    {
        this(num, payments, "Mayfield");

    }
    public CarInsurancePolicy2(int num)
    {
        this(num,2);
    }
    public void display()
    {
        String str = "\tPolicy # %s. %s payments annually. Driver resides in %s \n.";
        System.out.printf(str, policyNumber, numPayments, residentCity);
    }
}
