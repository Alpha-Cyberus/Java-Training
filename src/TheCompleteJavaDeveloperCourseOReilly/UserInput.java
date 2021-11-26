package TheCompleteJavaDeveloperCourseOReilly;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;

        System.out.println("What is your name?");
        name = keyboard.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("What is your age?");
        age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Age is " + age);
    }
}
