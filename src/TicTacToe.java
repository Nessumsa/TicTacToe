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

        System.out.print("Welcome to a game of Tic Tac Toe");
        System.out.print("\nWhat is the name of player 1: ");
        String player1 = scanner.nextLine();
        System.out.print("\nWhat is the name of player 2: ");
        String player2 = scanner.nextLine();
        System.out.printf("Round 1 is about to start. \n%s will mark the board with X and %s will mark with O. \n%s will begin", player1, player2, player1);


    }//End void main

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        printGameBoard();
        //Random comment
    }
    private static void printGameBoard(){

        for(char[] row : gameBoard){

          System.out.println(Arrays.toString(row));
        }
    }

}//End of TicTacToe
