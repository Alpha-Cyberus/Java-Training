package TheCompleteJavaDeveloperCourseOReilly;

import java.util.Arrays;
import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {
        char currPlayer = 'X';
        char[][] gameGrid = initGrid(); // Prepare blank grid
        printGrid(gameGrid); // Display grid

        int[] pC = playerCoordinate(currPlayer); // Request and return player input for selected coordinate
        gameGrid[pC[0]][pC[1]] = currPlayer;

    }

    public static char[][] initGrid() {
        char[][] gameGrid = new char[3][3];

        for (char[] chars : gameGrid) {
            Arrays.fill(chars, ' ');
        }

        return gameGrid;
    } // end initGrid

    public static void printGrid(char[][] gameGrid) {
        for (int i = 0; i < 3; i++) {
            System.out.print(gameGrid[i][0]);
            System.out.print("|");
            System.out.print(gameGrid[i][1]);
            System.out.print("|");
            System.out.println(gameGrid[i][2]);

            if (i < 2) {
                System.out.println("-+-+-");
            }
        }
    } //end printGrid

    public static int[] playerCoordinate(char pTurn) {
        Scanner kbd = new Scanner(System.in);
        int[] pI = new int[2];

        System.out.println("It's " + pTurn + "'s turn");
        System.out.println("Enter a number (1-3) for the row THEN the column, separated by a space.");

        do {
            String input = kbd.nextLine();

            if (input.length() > 3) {
                System.out.println("Input too long! Try again.");
                continue;
            }
            pI[0] = Integer.parseInt(input.substring(0,1));
            pI[1] = Integer.parseInt(input.substring(2));
            if (pI[0] < 1 || pI[0] > 3) {
                System.out.println(
                        "First number is not between 1 and 3, try again.");
            continue;
            } else if (pI[1] < 1 || pI[1] > 3) {
                System.out.println("Second number is not between 1 and 3, try again.");
            continue;
            }
            break;
        } while (true);

        return pI;
    } // end playerCoordinate
}
