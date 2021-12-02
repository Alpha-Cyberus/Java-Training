package TheCompleteJavaDeveloperCourseOReilly;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        ArrayList<String> fName = new ArrayList<>();
        ArrayList<String> lName = new ArrayList<>();

        String fullName;
        int findSpace;

        System.out.println("Enter 5 full names.");

        for (int i = 0; i < 5; i++) {
            fullName = kbd.nextLine();
            findSpace = fullName.indexOf(" ");

            fName.add(fullName.substring(0, findSpace));
            lName.add(fullName.substring((findSpace + 1)));
        }

        for (String f : fName) {
            for (String l : lName) {
                System.out.println(f + " " + l);
            }
        }
        kbd.close();
    }
}
