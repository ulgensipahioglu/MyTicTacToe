public abstract class Player {
    // The player's name ("You" and "Computer")
    // Used to identify each player during the game.
    protected String name; 

    // The player's symbol (X or O)
    // Determines which mark this player will place on the board.
    protected char symbol;

    // Constructor
    // Initializes a new player with a given name and symbol.
    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    // Abstract method: every player must be able to make a move.
    // The way the move is made depends on the subclass:
    // - HumanPlayer: gets input from the user.
    // - ComputerPlayer: chooses a random move automatically.
    public abstract void makeMove(Board board); 

}