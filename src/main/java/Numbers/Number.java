package Numbers;

import java.util.Random;

public class Number {
    // declare number to guess
    private final int number = new Random().nextInt(0, 100);

    // get number to guess
    public int getNumber() {
        return number;
    }
}
