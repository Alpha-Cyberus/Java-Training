package theCompleteJavaDeveloperCourseOReilly;

import java.util.Scanner;
import java.util.Random;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner kbd = new Scanner(System.in);

        int myNum = rand.nextInt(100) + 1;

        System.out.println("Pick a number from 1 - 100.");
        int myGuess = kbd.nextInt();

        int guessCount = 1;

        while (myGuess != myNum) {
            if (myGuess < 1 || myGuess > 100) {
                System.out.println("That number was not between 1 and 100. Try again.");
                myGuess = kbd.nextInt();
                guessCount ++;
            } else if (myGuess < myNum) {
                System.out.println("Wrong, your guess was too low. Try again.");
                myGuess = kbd.nextInt();
                guessCount ++;
            } else if (myGuess > myNum) {
                System.out.println("Wrong, your guess was too high. Try again.");
                myGuess = kbd.nextInt();
                guessCount ++;
            }
        }

        if (myGuess == myNum) {
            System.out.println("Correct, the number was " + myNum + ". You found it in " + guessCount + " attempts.");
        }
        kbd.close();
    }
}
