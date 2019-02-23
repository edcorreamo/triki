
package iU;

import Data.Board;
import Data.Player;


public interface IU {

    public  void printWelcome(Player player1, Player player2);

    public  int askMovement(Board board, char player);
    
    public  int askMenuOption();

    public  void printError();

    public  void printBoard(Board board);

    public  void printWinner(Player player);

    public  void printTie();
    
    public int printMenu();
}


