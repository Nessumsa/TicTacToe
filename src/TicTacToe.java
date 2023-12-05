import java.util.Scanner;

public class TicTacToe {

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

}//End of TicTacToe
