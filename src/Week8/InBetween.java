package Week8;

import support.cards.Card;
import support.cards.CardDeck;

import java.util.Scanner;

public class InBetween extends CardDeck {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //char reply = keyboard.nextLine().charAt(0);
        int chips = 100;
        CardDeck cardDeck = new CardDeck();
        cardDeck.shuffle();
        Card card1;
        Card card2;
        Card card3;
        char yes = 'Y';
        char no = 'N';

        System.out.println("Lets play In Between!!");

        while (chips >= 1 && NUMCARDS > 2){
            System.out.println("Please place a bet between 1 " +  "and "+ chips);
            int bet = keyboard.nextInt();
            System.out.println("Your bet "  + bet + " chips\n");
            chips = chips-bet;
            card1 = cardDeck.nextCard();
            card2 = cardDeck.nextCard();
            System.out.println("First Card is " + card1 + "\n");
            System.out.println("Second Card is " + card2 + "\n");

            while (card2.compareTo(card1) == 0){
                chips = chips + 2;
                System.out.println("You are awarded with 2 chips");

                card1 = cardDeck.nextCard();
                card2 = cardDeck.nextCard();

                System.out.println("First Card is " + card1 + "\n");
                System.out.println("Second Card is " + card2 + "\n");
            }
            System.out.println("Would you like to double your bet? Y/N");
            keyboard.nextLine();
            char reply = keyboard.nextLine().charAt(0);
            card3 = cardDeck.nextCard();
            System.out.println("Third card " + card3);

            if ((card3.compareTo(card1) > 0) && (card3.compareTo(card2) < 0) || (card3.compareTo(card2) > 0 && (card3.compareTo(card1) < 0) && (reply == 'Y'))){
                bet = bet * 2;
                chips = chips + bet;
                System.out.println("You earned double");
                System.out.println("Your total chips is " + chips);
            }

            else if ((card3.compareTo(card1) < 0 && (card3.compareTo(card2) > 0) && (reply == 'Y'))){
                bet = bet *2;
                chips = chips - bet;
                System.out.println("You lost double");
                System.out.println("Your total chips is " + chips);
            }
            else{
                System.out.println("You have a remaining " + chips + " chips");
            }

            //System.out.println("You have a remaining " + chips + " chips");
            //System.out.println("Remaining Cards " + NUMCARDS);
        }
    }
}
