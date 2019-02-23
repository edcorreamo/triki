
package iU;

import Data.Board;
import Data.Player;
import java.util.Scanner;


public class UIText implements IU{
    private static String lineDecorator = "xoXOxo xoXOxo oxoX-Oxox xoXOxo xoXOxo";
    private static Scanner reader = new Scanner(System.in);

    
     @Override
     public void printWelcome(Player player1, Player player2) {

        System.out.println(lineDecorator);
        System.out.println("xoXOxo xoXOxo TicTacToe xoXOxo xoXOxo");
        System.out.println(lineDecorator);

        System.out.println();
        System.out.println(player1);
        System.out.println(player2);

        System.out.println();
        System.out.println(lineDecorator);
        System.out.println("\nPlayer " + player1.getPlayer() + " starts");

    }
     @Override
    public  int askMovement(Board board, char player) {

        printBoard(board);

        System.out.println("Player " + player + " turn ");
        System.out.println("Select the square to play and press the enter key: ");

        return reader.nextInt();
    }
     @Override
     public  int askMenuOption(){
     
         System.out.println("h");
         return 0;
     }
     
     
    @Override
    public void printError() {
        System.out.println("\n\tPLEASE TRY AGAIN");
    }
    @Override
    public  void printBoard(Board board) {
        System.out.println(board);
    }
   @Override
    public void printWinner(Player player) {
        System.out.println(lineDecorator);
        System.out.println(lineDecorator);
        System.out.println();
        System.out.println("\t Winner is player " + player.getPlayer());
        System.out.println();
        System.out.println(lineDecorator);
        System.out.println(lineDecorator);
    }
    @Override
    public  void printTie() {
        System.out.println(lineDecorator);
        System.out.println(lineDecorator);
        System.out.println();
        System.out.println("\t\t TIE");
        System.out.println();
        System.out.println(lineDecorator);
        System.out.println(lineDecorator);
    }
     @Override
     public  int printMenu(){
     
         System.out.println("h");
         return 0;
     }

}
