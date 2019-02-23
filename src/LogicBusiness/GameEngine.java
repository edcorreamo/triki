
package LogicBusiness;


import Data.Board;
import Data.Player;
import iU.UIText;
import iU.IU;
import iU.UISwing;

public class GameEngine {

    private static Player player1;
    private static Player player2;
    private static Board board;
    private static IU inter;
    public static void main(String[] args) {
      UISwing ventana= new UISwing();
        
        
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UISwing().setVisible(true);
            }
        });
     
        
        
        startGame();
    }

    
    //Codigo Pendiente
    
    
    
    
    
    
    private static void startGame() {

        player1 = new Player('X', true);
        player2 = new Player('O', false);
        board = new Board();

      inter.printWelcome(player1, player2);
        play();
    }

    private static void play() {

        Player current = null;
        boolean isTie = false;
        boolean isWinner = false;

        do {
            current = getCurrentPlayer(current);
            board = TurnController.playTurn(board, current, inter);

            if (MovementHandler.isWinningMovement(board, current)) {
               inter.printWinner(current);
                isWinner = true;
            } else {
                if (!TurnController.existFreeSquares(board, player1, player2)) {
                   inter.printTie();
                    isTie = true;
                }
            }

        } while (!isWinner && !isTie);

    }

    private static Player getCurrentPlayer(Player current) {

        if (current == null) {
            return player1;
        } else {
            if (current == player1) {
                return player2;
            } else {
                return player1;
            }
        }
    }
}


