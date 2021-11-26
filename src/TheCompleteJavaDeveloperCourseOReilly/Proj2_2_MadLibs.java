package TheCompleteJavaDeveloperCourseOReilly;

import java.util.Scanner;

public class Proj2_2_MadLibs {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        String adj1, adj2, adj3, bName, cloth, gName, hobby, mName, occ1, occ2, place;

        System.out.println("Enter an adjective");
        adj1  = keyboard.nextLine();
        System.out.println("Enter an adjective");
        adj2  = keyboard.nextLine();
        System.out.println("Enter an adjective");
        adj3  = keyboard.nextLine();
        System.out.println("Enter a boy's name");
        bName  = keyboard.nextLine();
        System.out.println("Enter a piece of clothing");
        cloth  = keyboard.nextLine();
        System.out.println("Enter a girl's name");
        gName  = keyboard.nextLine();
        System.out.println("Enter a hobby");
        hobby  = keyboard.nextLine();
        System.out.println("Enter a man's name");
        mName  = keyboard.nextLine();
        System.out.println("Enter an occupation");
        occ1  = keyboard.nextLine();
        System.out.println("Enter an occupation");
        occ2  = keyboard.nextLine();
        System.out.println("Enter a place");
        place  = keyboard.nextLine();

        System.out.println("There once was a " + adj1 + " girl named " + gName + ", who was a " + adj2 + " " + occ1 + " in the Kingdom of " + place + ". She loved to wear " + cloth + " and to " + hobby + ".");
        System.out.println("She wanted to marry the " + adj3 + " " + occ2 + " named " + bName + " but her father, King " + mName + " forbid her from seeing him.");
    }
}
