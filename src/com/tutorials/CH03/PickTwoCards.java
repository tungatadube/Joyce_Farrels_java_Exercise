package com.tutorials.CH03;
import java.util.Scanner;

public class PickTwoCards
    /*
        Write an application that randomly selects two playing cards and displays their
        values. Simply assign a suit to each of the cards, but generate a random number for
        each card’s value. Appendix D contains information on generating random numbers.
        To fully understand the process, you must learn more about Java classes and
        methods. However, for now, you can copy the following statements to generate a
        random number between 1 and 13 and assign it to a variable:
        final int CARDS_IN_SUIT = 13;
        myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        After reading the chapter “Making Decisions,” you will be able to have the game
        determine the higher card. For now, just observe how the card values change as you
        execute the program multiple times. Save the application as PickTwoCards.java.
     */

{
    public static void main(String[] args)

    {
        Card card = new Card();
        getData(card);
       System.out.printf(playCardgame(), card.getCardNumber(), card.getCard());
    }

    public static Card getData(Card cd)
    {
        String card;
        int cardNumber;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Choose a card between (s (spades), d (diamonds), c (clubs), and h (hearts) >>> ");
        card =  keyboard.nextLine();
        cardNumber = (int)((Math.random() * 100) % 13 + 1);

        cd.setCard(card);
        cd.setCardNumber(cardNumber);

        return cd;
    }

    public static String playCardgame()
    {
        String displaystring = "You have chosen a %s of %s.";
        return displaystring;
    }
}
