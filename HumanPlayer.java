import java.util.Scanner;

public class HumanPlayer extends Player {
    // Scanner object to read input from the user.

    private Scanner myScanner;
    // Constructor.
    // Calls the superclass (Player) constructor and creates a Scanner for input.
  
    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
        myScanner = new Scanner(System.in);
    }

    // Overrides the abstract method from Player.
    // This method asks the human user to enter their move and validates it.
    @Override
    public void makeMove(Board board) {
        boolean valid = false; // keeps track of whether the move is valid
        while (!valid) { // repeat until a valid move is made
            try {
                 // Prompt the user for input
                System.out.println(name + " are " + symbol + ", enter your move (row and col 0-2):");
                
                // Read row and column from the user
                int row = myScanner.nextInt();
                int col = myScanner.nextInt();

                // Try to make the move on the board
                valid = board.makeMove(row, col, symbol);

                // If the move was invalid (spot taken or out of range)
                if (!valid) {
                System.out.println("Invalid move, try again! (either out of range or spot taken)");
                }
             }
            catch (Exception e) {
                // If the user entered something that's not a number
                System.out.println("Invalid input! Please enter numbers only (0-2).");
                myScanner.nextLine(); // clear the invalid input from the scanner buffer
            }
     
            }
        }

    }
