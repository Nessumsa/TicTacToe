import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class TicTacToe {

    static char[][] gameBoard =
            {{'_','_','_'},
            {'_','_','_'},
            {'_','_','_'}};


    /**
     * Start of main of TicTacToe
     * @param args
     */
    public static void main(String[] args) {
        printGameBoard();
        System.out.print("Welcome to a game of Tic Tac Toe");
        System.out.print("\nWhat is the name of player 1: ");
        String player1 = scanner.nextLine();
        System.out.print("\nWhat is the name of player 2: ");
        String player2 = scanner.nextLine();
        System.out.printf("Round 1 is about to start. \n%s will mark the board with X and %s will mark with O. \n%s will begin", player1, player2, player1);


    }//End void main

    private static Scanner scanner = new Scanner(System.in);

    private static void printGameBoard(){
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j <gameBoard[i].length ; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();

        }
    }

}//End of TicTacToe
