package Cards;

import java.util.Scanner;

public class UserGuess {

    private String userGuess; // declare user guess int

    public String getUserGuess() { // return user guess
        return userGuess;
    }

    public void setUserGuess() { // set user guess
        Scanner guess = new Scanner(System.in);
        this.userGuess = guess.nextLine();
    }
}
