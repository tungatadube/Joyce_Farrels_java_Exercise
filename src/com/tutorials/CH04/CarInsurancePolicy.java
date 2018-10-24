package com.tutorials.CH04;



public class CarInsurancePolicy
    /*
         Creating Overloaded Constructors
        In this section, you create a class with overloaded constructors and demonstrate how
        they work.
        1. Open a new file in your text editor, and start the CarInsurancePolicy class as
        follows. The class contains three fields that hold a policy number, the number
        of payments the policyholder will make annually, and the policyholder’s city of
        residence.
        public class CarInsurancePolicy
        {
        private int policyNumber;
        private int numPayments;
        private String residentCity;
        2. Create a constructor that requires parameters for all three data fields.
        public CarInsurancePolicy(int num, int payments, String city)
        {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
        }
        3. Suppose the agency that sells car insurance policies is in the city of Mayfield.
        Create a two-parameter constructor that requires only a policy number and
        the number of payments. This constructor assigns Mayfield to residentCity.
        public CarInsurancePolicy(int num, int payments)
        {
        policyNumber = num;
        numPayments = payments;
        residentCity = "Mayfield";
        }
        4. Add a third constructor that requires only a policy number parameter. This
        constructor uses the default values of two annual payments and Mayfield as
        the resident city. (Later in this chapter, you will learn how to eliminate the
        duplicated assignments in these constructors.)
        public CarInsurancePolicy(int num)
        {
        policyNumber = num;
        numPayments = 2;
        residentCity = "Mayfield";
        }
        (continues)
        Creating and Calling Constructors with Parameters
        203
        Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
        Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
        5. Add a display() method that outputs all the insurance policy data:
        public void display()
        {
        System.out.println("Policy #" + policyNumber + ". " +
        numPayments + " payments annually. Driver resides in " +
        residentCity + ".");
        }
        6. Add a closing curly brace for the class. Save the file as
        CarInsurancePolicy.java.
        7. Open a new text file to create a short application that demonstrates the
        constructors at work. The application declares three CarInsurancePolicy
        objects using a different constructor version each time. Type the following code:
        public class CreatePolicies
        {
        public static void main(String[] args)
        {
        CarInsurancePolicy first = new CarInsurancePolicy(123);
        CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
        CarInsurancePolicy third = new CarInsurancePolicy
        (789, 12, "Newcastle");
        8. Display each object, and add closing curly braces for the method and the class:
        first.display();
        second.display();
        third.display();
        }
        }
        9. Save the file as CreatePolicies.java, and then compile and test the program.
        The output appears in Figure 4-23.
        (continued)
        Figure 4-23 Output of the CreatePolicies program
        (continues)
        C H A P T E R 4 More Object Concepts
        204
        Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
        Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
        10. Add a fourth declaration to the CreatePolicies class that attempts to create
        a CarInsurancePolicy object using a default constructor:
        CarInsurancePolicy fourth = new CarInsurancePolicy();
        11. Save and compile the revised CreatePolicies program. The class does not
        compile because the CarInsurancePolicy class does not contain a default
        constructor. Change the newly added declaration to a comment, compile the
        class again, and observe that the class now compiles correctly.
     */

{
    private int policyNumber;
    private int numPayments;
    private String residentCity;

    public CarInsurancePolicy(int num, int payments, String city)
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;


    }

    public CarInsurancePolicy(int num, int payments)
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = "Mayfield";

    }
    public CarInsurancePolicy(int num)
    {
        policyNumber = num;
        numPayments = 2;
        residentCity = "Mayfield";
    }
    public void display()
    {
        String str = "\tPolicy # %s. %s payments annually. Driver resides in %s \n.";
        System.out.printf(str, policyNumber, numPayments, residentCity);
    }
}
