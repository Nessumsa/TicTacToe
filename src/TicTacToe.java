import java.util.Arrays;
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
