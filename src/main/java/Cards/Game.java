package Cards;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    public static void main(String[] args) {
        Card card = new Card();

        System.out.println("Guess the card!");
        System.out.println("use notation: 'value' of 'kind'\ne.g. 'Ace of Spades'");
        UserGuess userGuess = new UserGuess();
        userGuess.setUserGuess();

        while (!(userGuess.getUserGuess().equalsIgnoreCase(card.getCard()))) {
            System.out.println("Try again: ");
            userGuess.setUserGuess();
        }

        System.out.println("Correct guess!");
    }
}
