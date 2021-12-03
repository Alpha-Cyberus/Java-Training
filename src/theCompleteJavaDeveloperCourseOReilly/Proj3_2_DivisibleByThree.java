package theCompleteJavaDeveloperCourseOReilly;

import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give a number");
        int myNum = keyboard.nextInt();

        if(myNum % 3 == 0) {
            System.out.println(myNum + " is divisible by 3!");
        } else {
            System.out.println(myNum + " is not divisible by 3 :(");
        }
        keyboard.close();

    }
}
