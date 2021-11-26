package TheCompleteJavaDeveloperCourseOReilly;

import java.util.Arrays;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {
        String[][] gridField = initGrid(); // Prepare grid
        refreshDisplay(gridField);

    }

    public static String[][] initGrid() {
        String[][] gridField = new String[3][3];
        for (String[] strings : gridField) {
            Arrays.fill(strings, "/");
        }
        return gridField;
    }


    // display

    public static void refreshDisplay(String[][] gridField) {
//        for(String[] arr : gridField) {
//            for(String num : arr) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 5; i++) {
            System.out.print(gridField[i][0]);
            System.out.print();
            System.out.print(gridField[i][1]);
            System.out.print();
            System.out.print(gridField[i][0]);

            System.out.println();
        }



    }

    // update



    // check


    // decide

}
