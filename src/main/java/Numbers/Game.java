package Numbers;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Game {
    public static void main(String[] args) {

        ArrayList<Integer> usedNumbers = new ArrayList<>();

        Number number = new Number();
        int guessingNumber = number.getNumber();
        System.out.println(guessingNumber);

        UserGuess userGuess = new UserGuess();

        boolean active = true;


        while(active)  {

            boolean repeat = true;
            while (repeat) {
                try {
                    userGuess.setUserGuess();
                    repeat = false;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input -- enter only integers");
                }
            }

            int guess = userGuess.getUserGuess();

            while (usedNumbers.contains(guess)) {
                System.out.println("Number already used! Try another: ");
                userGuess.setUserGuess();
                guess = userGuess.getUserGuess();
            }

            if (guess > guessingNumber) {
                System.out.println("Too high!");
            } else if (guess < guessingNumber) {
                System.out.println("Too low!");
            } else active = false;

            usedNumbers.add(guess);
        }

        System.out.println("Congratulations, you guessed correctly!");
    }
}
