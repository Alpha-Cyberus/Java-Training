package TheCompleteJavaDeveloperCourseOReilly;

import java.util.Scanner;

public class ControlStatementsIntro {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
        int myVar = 1;
        int input;
        // Sequence control statements

        // Selection control statements
        if (myVar > 1) {
            myVar ++;
        }
        else if (myVar < 1){
            myVar ++;
        }
        else {
            myVar ++;
        }

        switch(myVar) {
            case 0: break;
            case 1: break;
            default: myVar ++;
        }

        // Repetition control statements
        // counter based = based on a variable which counts. sentinel based = ???
        while(myVar < 10) { // pre-test loop, it performs the test before execution
            myVar ++;
        }

        System.out.println("0+ to carry on, < 0 to exit");
        input = keyboard.nextInt();

        while(input >= 0) {
            System.out.println(input);
            System.out.println("0+ to carry on, < 0 to exit");
            input = keyboard.nextInt();
        }

        do { // post-test loop, it executes and then tests the condition
            myVar ++;
        } while (myVar < 10);

        for(int i = 1; i < myVar; i++) {
            myVar ++;
        }
        keyboard.close();
    }
}

/*
3 categories of control statements
Sequential
Selection
Repetition
 */