package TheCompleteJavaDeveloperCourseOReilly;

import java.util.Arrays;
import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {
        int gameState; // 0= Game not over, 1= winner, 2= draw
        char currentPlayer = 'X'; // as cP
        char[][] gameGrid; // as gG
        int[] playerCoordinate; // as pC

        { // Initialize game
            gameGrid = initGrid(); // Prepare blank grid
            printGrid(gameGrid); // Display grid
        }

        do{ // Game cycle, run until winner is detected
            currentPlayer = setPlayer(currentPlayer); // Set current player

            System.out.println("It's " + currentPlayer + "'s turn");
            System.out.println("Enter a number (1-3) for across THEN down, separated by a space.");

            playerCoordinate = playerInput(gameGrid); // Process player input as coordinate
            gameGrid[playerCoordinate[0]][playerCoordinate[1]] = currentPlayer; // Input pC into gG
            printGrid(gameGrid); // Display grid

            gameState = checkState(gameGrid);// Check for endgame conditions
        } while (gameState == 0);

        switch (gameState) {
            case 1 -> System.out.println("Game over. " + currentPlayer + " is the winner. Congratulations!");
            case 2 -> System.out.println("Game over. The game was a draw. You both suck.");
        }
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

    public static int[] playerInput(char[][] gG) {
        Scanner kbd = new Scanner(System.in);
        String input;
        int[] pI = new int[2];

        do {
            input = kbd.nextLine();
            if (input.length() != 3 || input.charAt(1) != ' ') { // Test: input length with space in middle
                System.out.println("Input must be number space number. Try again.");
                continue;
            }

            try { // Test: Input is numeric only
                pI[1] = Integer.parseInt(input.substring(0,1)) - 1; // -1 because input is 1-3 and gG goes 0-2
                pI[0] = Integer.parseInt(input.substring(2)) - 1;
            }catch (Exception e) {
                System.out.println("Input must be number space number. Try again.");
                continue;
            }

            if (pI[1] < 0 || pI[1] > 2) {
                System.out.println("First number is not between 1 and 3, try again.");
                continue;
            } else if (pI[0] < 0 || pI[0] > 2) {
                System.out.println("Second number is not between 1 and 3, try again.");
                continue;
            } else if (gG[pI[0]][pI[1]] != ' ') {
                System.out.println("This space is taken, try again");
                continue;
            }
            break;
        } while (true);
        
        kbd.close();
        return pI;
    } // end playerCoordinate

    public static int checkState(char[][] gG) {
        // If first space not empty and whole row or column matches (winner)
        for (int i = 0; i < 3; i++) {
            if (gG[i][0] != ' ' && gG[i][0] == gG[i][1] && gG[i][1] == gG[i][2]) {
                return 1;
            } else if (gG[0][i] != ' ' && gG[0][i] == gG[1][i] && gG[1][i] == gG[2][i]) {
                return 1;
            }
        }
        // If corner not empty and whole diagonal matches (winner)
        if (gG[0][0] != ' ' && gG[0][0] == gG[1][1] && gG[1][1] == gG[2][2]) {
            return 1;
        } else if (gG[0][2] != ' ' && gG[0][2] == gG[1][1] && gG[1][1] == gG[2][0]) {
            return 1;
        }

        // If any space is empty (continue game)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gG[i][j] == ' ') {
                    return 0;
                }
            }
        }
        // Board is full (tie)
        return 2;
    } // end checkState

    public static char setPlayer(char cP) {
            if (cP == 'X') {
                cP = 'O';
            } else {
                cP = 'X';
            }
        return cP;
    } // end setPlayer
}
