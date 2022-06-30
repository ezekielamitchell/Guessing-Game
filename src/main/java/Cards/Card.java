package Cards;

import java.util.Arrays;
import java.util.Random;

public class Card {

    private final String card;

    String[] number = {"Ace", "King", "Queen", "Jack",
            "10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};

    String[] kind = {"Spades", "Hearts", "Diamonds", "Clubs"};

    public Card() {
        Random random = new Random();
        card = (number[random.nextInt(number.length)] +
                " of " + kind[random.nextInt(kind.length)]);
    }

    public String getCard() {
        return card;
    }
}
