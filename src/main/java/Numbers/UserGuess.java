package Numbers;

import java.util.Scanner;

public class UserGuess {

    private int userGuess; // declare user guess int

    public int getUserGuess() { // return user guess
        return userGuess;
    }

    public void setUserGuess() { // set user guess
        System.out.println("Guess an integer between 1 & 100: ");
        Scanner guess = new Scanner(System.in);
        this.userGuess = guess.nextInt();
    }
}
