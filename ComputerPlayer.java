import java.util.Random;

public class ComputerPlayer extends Player {
    // Random object to select a move randomly.

    private Random random;

    // Constructor.
    // Calls the superclass (Player) constructor and creates a Random object.
    public ComputerPlayer(String name, char symbol) {
        super(name, symbol);
        random = new Random();
    }


    // Overrides the abstract method from Player.
    // Chooses a random empty cell on the board and places the symbol there.
    @Override
    public void makeMove(Board board) {
        
        // Repeat until a valid move is made
        boolean valid = false; // keeps track of whether the move is valid
        while (!valid) {
            int row = random.nextInt(3); // random row (0-2)
            int col = random.nextInt(3); // random column (0-2)

            // Try to place the symbol on the board
            valid = board.makeMove(row, col, symbol);
        }

         // Inform that the computer has made a move
        System.out.println(name + " made a move!");
    }
}