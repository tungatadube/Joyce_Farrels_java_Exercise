package com.tutorials.CH04;

public class DemoBlock
    /*
        Demonstrating Scope
        In this section, you create a method with several blocks to demonstrate block scope.
        1. Start your text editor, and then open a new document, if necessary.
        2. Type the first few lines for a class named DemoBlock:
        (continues)
        C H A P T E R 4 More Object Concepts
        190
        Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
        Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
        public class DemoBlock
        {
        public static void main(String[] args)
        {
        3. Add a statement that displays the purpose of the program:
        System.out.println("Demonstrating block scope");
        4. On a new line, declare an integer named x, assign the value 1111 to it,
        and display its value:
        int x = 1111;
        System.out.println("In first block x is " + x);
        5. Begin a new block by typing an opening curly brace on the next line. Within
        the new block, declare another integer named y, and display x and y. The value
        of x is 1111, and the value of y is 2222:
        {
        int y = 2222;
        System.out.println("In second block x is " + x);
        System.out.println("In second block y is " + y);
        }
        6. On the next line, begin another new block. Within this new block, declare a
        new integer with the same name as the integer declared in the previous block;
        then display x and y. The value of y is 3333. Call a method named demoMethod(),
        and display x and y again. Even though you will include statements within
        demoMethod() that assign different values to x and y, the x and y displayed
        here are still 1111 and 3333:
        {
        int y = 3333;
        System.out.println("In third block x is " + x);
        System.out.println("In third block y is " + y);
        demoMethod();
        System.out.println("After method x is " + x);
        System.out.println("After method block y is " + y);
        }
        7. On a new line after the end of the block, type the following:
        System.out.println("At the end x is " + x);
        This last statement in the main() method displays the value of x, which is
        still 1111. Type a closing curly brace.
        (continued)
        (continues)
        Understanding Blocks and Scope
        191
        Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
        Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
        8. Finally, enter the following demoMethod() that creates its own x and y variables,
        assigns different values, and then displays them:
        public static void demoMethod()
        {
        int x = 8888, y = 9999;
        System.out.println("In demoMethod x is " + x);
        System.out.println("In demoMethod block y is " + y);
        }
        9. Type the final closing curly brace, and then save the file as DemoBlock.java.
        At the command prompt, compile the file by typing the command
        javac DemoBlock.java. If necessary, correct any errors, and compile
        the program again.
        10. Run the program by typing the
        command java DemoBlock.
        Your output should look like
        Figure 4-11. Make certain you
        understand how the values of
        x and y are determined in each
        line of output.
        11. To gain a more complete
        understanding of blocks and
        scope levels, change the values
        of x and y in several locations
        throughout the program, and
        try to predict the exact output
        before resaving, recompiling,
        and rerunning the program.
     */ {
    public static void main(String[] args) {

        System.out.println("Demonstrating block scope");
        int x = 111;
        System.out.println("In the first block x is " + x);


        {

            int y = 2222;
            System.out.println("In the second block x is " + x);
            System.out.println("In the second block the value of y is " + y);
        }
        {

            int y = 3333;
            System.out.println("In the third block x is " + x);
            System.out.println("In the third block the value of y is " + y);
            demoMethod();
            System.out.println("After the method call the value of x is still " + x);
            System.out.println("After the method call the value of y is still " + y);

        }
        System.out.println("At the end x is still "+ x);

    }
    public static void demoMethod()
    {
        int x = 8888;
        int y = 9999;
        System.out.println("The value of x printed by the demoMethod() is " + x );
        System.out.println("The value of y printed by the demoMethod() is " + y);
    }
}

