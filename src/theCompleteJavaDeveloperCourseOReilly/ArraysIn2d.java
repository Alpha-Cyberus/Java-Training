package theCompleteJavaDeveloperCourseOReilly;

import java.util.Random;

public class ArraysIn2d {
    public static void main(String[] args) {
        int[][] my2DArr = new int[2][2];

        fill2DArray(my2DArr);
        print2DArray(my2DArr);
    }

    public static void fill2DArray(int[][] twoDArr) {
        Random rand = new Random();

        for (int[] outer : twoDArr) {
            for (int j = 0; j < outer.length; j++) {
                outer[j] = rand.nextInt(100);
            }
        }
    }

    public static void print2DArray(int[][] twoDArr) {
        for(int[] arr : twoDArr) {
            for(int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
