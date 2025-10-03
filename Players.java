import java.util.Scanner;
import java.util.Random;


public class Players {
    private String playerName;
    private char symbol; // X and O
    private boolean isComputer;
    private Random random;
    private Scanner myScaner;


public Players(String playerName, char symbol, boolean isComputer) {
    this.playerName = playerName;
    this.symbol = symbol;
    this.isComputer = isComputer;

    if (isComputer) random = new Random();
    else myScaner = new Scanner(System.in);
}

public void makeMove(Board board) {  // move is valid?
    boolean valid  = false;

    if (isComputer) { //computer
        while (!valid) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);
            valid = board.makeMove(row, col, symbol);
            
        }
        System.out.println(playerName + "made a move!");

    }
    else{ //human
        while (!valid) {
            System.out.println(playerName + " are " + symbol + ", enter your move (row and col 0-2):");
            int row = myScaner.nextInt();
            int col = myScaner.nextInt();
            valid = board.makeMove(row, col, symbol);

            if(!valid) {
                System.out.println("Invalid move, tyr again!");
            }
            
        }
    }
  }
}