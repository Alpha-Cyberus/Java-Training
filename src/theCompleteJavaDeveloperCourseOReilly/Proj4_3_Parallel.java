package theCompleteJavaDeveloperCourseOReilly;

import java.util.Scanner;
import java.util.ArrayList;

public class Proj4_3_Parallel {
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        ArrayList<String> arrNames = new ArrayList<>();
        int[] arrAge = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Give a name: ");
            arrNames.add(kbd.nextLine());
            System.out.print("Give an age: ");
            arrAge[i] = kbd.nextInt();
            kbd.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arrNames.get(i) + " is " + arrAge[i] + " years old.");
        }
        kbd.close();
    }
}
