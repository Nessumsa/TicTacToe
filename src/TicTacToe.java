import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class TicTacToe {
    private static Scanner scanner = new Scanner(System.in);
    private static String player1 = "";
    private static String player2 = "";
    private static String roundPlayer = "";
    private static int roundNum = 0;

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
        player1 = scanner.nextLine();
        System.out.print("\nWhat is the name of player 2: ");
        player2 = scanner.nextLine();
        System.out.printf("Round 1 is about to start. \n%s will mark the board with X and %s will mark with O. \n%s will begin", player1, player2, player1);


    }//End void main
    private static void roundPlay() {
        if (roundNum % 2 == 0) {
            roundPlayer = player2;
        } else {
            roundPlayer = player1;
        }
        System.out.printf("%s your turn to play.\nWhich row do you choose: ", roundPlayer);
        int rowIndex = scanner.nextInt();
        System.out.print("Which column do you choose: ");
        int columnIndex = scanner.nextInt();


    }
}//End of TicTacToe
