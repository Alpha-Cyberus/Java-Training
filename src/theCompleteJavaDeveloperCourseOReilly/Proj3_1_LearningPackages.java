package theCompleteJavaDeveloperCourseOReilly;

import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Which package? (1-3)");
        int pkg = keyboard.nextInt();
        while(pkg < 1 || pkg > 3) {
            System.out.println("Which package? (1-3)");
            pkg = keyboard.nextInt();
        }

        System.out.println("How many courses?");
        int crs = keyboard.nextInt();
        int crsExtra = 0;

        switch(pkg){
            case 1: // $10/month, inc. 2 courses, $6 per additional course
                if (crs > 2) {
                    crsExtra = crs - 2;
                }
                System.out.println("Total cost: " + (10 + (crsExtra*6)));
                break;
            case 2: // $12/month, inc. 4 courses, $4 per additional course
                if (crs > 4) {
                    crsExtra = crs - 4;
                }
                System.out.println("Total cost: " + (12 + (crsExtra*4)));
                break;
            case 3: // $15/month, inc. 6 courses, $3 per additional course
                if (crs > 6) {
                    crsExtra = crs - 6;
                }
                System.out.println("Total cost: " + (15 + (crsExtra*3)));
                break;
        }
        keyboard.close();
    }
}
