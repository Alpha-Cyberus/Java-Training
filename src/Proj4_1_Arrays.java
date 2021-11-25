import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int[] arrNum = new int[5];


        System.out.println("Give 5 integers.");
        for (int i = 0; i < 5; i++) {
            arrNum[i] = kbd.nextInt();
        }
        for (int j : arrNum) {
            System.out.println(j * 2);
        }
    }
}
