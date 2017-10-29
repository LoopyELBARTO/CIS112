package Week8;

import java.util.Scanner;
import support.cards.Card;
import support.cards.CardDeck;

public class InBetweenCardGame extends CardDeck {
    public InBetweenCardGame() {
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int chips = 100;
        CardDeck deck = new CardDeck();
        deck.shuffle();
        System.out.println("Welcome to the In Between Card Game!\n");

            while(chips > 0) {
                System.out.println("Please place a bet between 1 and " + chips);
                int bet = keyboard.nextInt();
                System.out.println("You have bet " + bet + " chips.\n");
                chips -= bet;
                System.out.println("You have " + chips + " remaining.\n");
                Card card1 = deck.nextCard();
                System.out.println("First card is: " + card1);
                Card card2 = deck.nextCard();
                System.out.println("Second card is: " + card2 + "\n");

                while(card1.compareTo(card2) == 0) {
                    chips += 2;
                    System.out.println("The cards are of the same rank. You have been awarded 2 chips.");
                    System.out.println("You now have " + chips + " chips.\n");
                    System.out.println("Please place a bet between 1 and " + chips);
                    bet = keyboard.nextInt();
                    System.out.println("You have bet " + bet + " chips.\n");
                    chips -= bet;
                    System.out.println("You have " + chips + " remaining.\n");
                    card1 = deck.nextCard();
                    System.out.println("First card is: " + card1);
                    card2 = deck.nextCard();
                    System.out.println("Second card is: " + card2 + "\n");
                }

                System.out.println("Would you like to double your bet? Y/N?");
                char reply = keyboard.nextLine().charAt(0);
                Card card3 = deck.nextCard();
                System.out.println("Third card is: " + card3);
                if ((card3.compareTo(card1) > 0 && card3.compareTo(card2) < 0 || card3.compareTo(card1) < 0 && card3.compareTo(card2) > 0) && reply == 'Y') {
                    bet = 2 * bet;
                    chips += bet;
                    System.out.println("Your new bet is " + bet + " chips.");
                    System.out.println("Congratulations! The third card is in between the first and second cards.");
                    System.out.println("You now have " + chips + " chips!");
                } else if ((card3.compareTo(card1) > 0 && card3.compareTo(card2) < 0 || card3.compareTo(card1) < 0 && card3.compareTo(card2) > 0) && reply == 'N') {
                    System.out.println("Sorry, you have lost " + bet + " number of chips.");
                    System.out.println("You now have " + chips + " chips remaining.\n");
                } else if ((card3.compareTo(card1) > 0 && card3.compareTo(card2) > 0 || card3.compareTo(card1) < 0 && card3.compareTo(card2) < 0) && reply == 'Y') {
                    bet = 2 * bet;
                    chips -= bet;
                    System.out.println("Sorry, you have lost " + bet + " chips.");
                    System.out.println("You now have " + chips + " chips remaining.\n");
                }
            }
        }
}
