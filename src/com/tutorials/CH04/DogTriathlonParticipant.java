package com.tutorials.CH04;

public class DogTriathlonParticipant
    /*
                    You Do It
            Using Static and Nonstatic final Fields
            In this section, you create a class for the Riverdale Kennel Club to demonstrate the use
            of static and nonstatic final fields. The club enters its dogs in an annual triathlon event
            in which each dog receives three scores in agility, conformation, and obedience.
            1. Open a new file in your text editor, and enter the first few lines for a
            DogTriathlonParticipant class. The class contains a final field that holds
            the number of events in which the dog participated. Once a final field is set,
            it should never change. The field is not static because it is different for each
            dog. The class also contains a static field that holds the total cumulative
            score for all the participating dogs. The field is not final because its value
            increases as each dog participates in the triathlon, but it is static because at
            any moment in time, it is the same for all participants.
            public class DogTriathlonParticipant
            {
            private final int NUM_EVENTS;
            private static int totalCumulativeScore = 0;
            2. Add six private fields that hold the participating dog’s name, the dog’s score in
            three events, the total score, and the average score:
            private String name;
            private int obedienceScore;
            private int conformationScore;
            private int agilityScore;
            private int total;
            private double avg;
            (continues)
            Using static Fields
            217
            Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
            Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
            3. The constructor for the class requires five parameters—the dog’s name, the
            number of events in which the dog participated, and the dog’s scores in the
            three events. (After you read the chapter on decision making, you will be able
            to ensure that the number of nonzero scores entered matches the number of
            events, but for now no such checks will be made.) The constructor assigns
            each value to the appropriate field.
            public DogTriathlonParticipant(String name,
            int numEvents, int score1, int score2, int score3)
            {
            this.name = name;
            NUM_EVENTS = numEvents;
            obedienceScore = score1;
            conformationScore = score2;
            agilityScore = score3;
            4. After the assignments, the constructor calculates the total score for the
            participant and the participant’s average score. Notice the result of the
            division is cast to a double so that any fractional part of the calculated
            average is not lost. Also, add the participant’s total score to the cumulative
            score for all participants. Recall that this field is static because it should be
            the same for all participants at any point in time. After these statements, add
            a closing curly brace for the constructor.
            total = obedienceScore +
            conformationScore + agilityScore;
            avg = (double) total / NUM_EVENTS;
            totalCumulativeScore = totalCumulativeScore +
            total;
            }
            5. Start a method that displays the data for each triathlon participant.
            public void display()
            {
            System.out.println(name + " participated in " +
            NUM_EVENTS +
            " events and has an average score of " + avg);
            System.out.println(" " + name +
            " has a total score of " + total +
            " bringing the total cumulative score to " +
            totalCumulativeScore);
            }
            6. Add a closing curly brace for the class. Then, save the file as
            DogTriathlonParticipant.java. Compile the class, and correct any errors.
            (continued)
            (continues)
            C H A P T E R 4 More Object Concepts
            218
            Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
            Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
            7. Open a new file in your text editor, and then enter the header and
            opening and closing curly braces for a class you can use to test the
            DogTriathlonParticipant class. Also include a main() method header
            and its opening and closing braces.
            public class TestDogs
            {
            public static void main(String[] args)
            {}
            }
            8. Between the braces of the main() method, declare a DogTriathlonParticipant
            object. Provide values for the participant’s name, number of events, and three
            scores, and then display the object.
            DogTriathlonParticipant dog1 =
            new DogTriathlonParticipant("Bowser", 2, 85, 89, 0);
            dog1.display();
            9. Create and display two more objects within the main() method.
            DogTriathlonParticipant dog2 =
            new DogTriathlonParticipant("Rush", 3, 78, 72, 80);
            dog2.display();
            DogTriathlonParticipant dog3 =
            new DogTriathlonParticipant("Ginger", 3, 90, 86, 72);
            dog3.display();
            10. Save the file as TestDogs.java. Compile and execute the program. The
            output looks like Figure 4-36. Visually confirm that each total, average,
            and cumulative total is correct.
            (continued)
            Figure 4-36 Output of the TestDogs program
            (continues)
            Using static Fields
            219
            Copyright 2016 Cengage Learning. All Rights Reserved. May not be copied, scanned, or duplicated, in whole or in part. Due to electronic rights, some third party content may be suppressed from the eBook and/or eChapter(s).
            Editorial review has deemed that any suppressed content does not materially affect the overall learning experience. Cengage Learning reserves the right to remove additional content at any time if subsequent rights restrictions require it.
            11. Experiment with the DogTriathlonParticipant class and its test class.
            For example, try the following:
            Add a new statement at the end of the TestDogs class that again displays
            the data for any one of the participants. Note that as long as no new
            objects are created, the cumulative score for all participants remains the
            same no matter which participant uses it.
            Try to assign a value to the NUM_EVENTS constant from the display()
            method, and then compile the class and read the error message generated.
            Remove the keyword static from the definition of totalCumulativeScore
            in the DogTriathlonParticipant class, and then recompile the classes
            and run the program. Notice in the output that the nonstatic cumulative
            score no longer reflects the cumulative score for all objects, but only the
            score for the current object using the display() method.
            Use 0 as the number of events for an object. When the participant’s
            average is calculated, the result is not numeric, and NaN is displayed.
            NaN is an acronym for Not a Number. In the next chapter, you will learn to
            make decisions, and then you can prevent the NaN output.
     */

{
    private final int NUM_EVENTS;
    private static int totalCumulativeScore = 0;

    private String name;
    private  int obedienceScore;
    private int conformationScore;
    private  int agilityScore;
    private int total;
    private double avg;

     public DogTriathlonParticipant(String name, int numEvents, int score1, int score2, int score3)
     {
         this.name = name;
         NUM_EVENTS = numEvents;
         obedienceScore = score1;
         conformationScore = score2;
         agilityScore = score3;

         total = obedienceScore + conformationScore + agilityScore;
         avg = (double) total/ NUM_EVENTS;
         totalCumulativeScore += total;

     }
     public void display()
     {

         String str = "%s participated in %s events and has an average score of %.2f.\n ";
         String str2  = "%s has a total score of %s bringing the total cumulative score to %s\n\n";
         System.out.printf(str, name, NUM_EVENTS, avg);
         System.out.printf(str2, name, total, totalCumulativeScore);
     }
}
