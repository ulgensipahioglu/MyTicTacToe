public class Game {
    private Board board;
    private Player human;
    private Player computer;



    // Constructor.
    // Creates a new game with a fresh board,
    // a human player (X) and a computer player (O).
    public Game() { 
        board = new Board();
        human = new HumanPlayer("You", 'X');
        computer = new ComputerPlayer("Computer", 'O');
    }



    // Starts the game loop.
    // Alternates between human and computer moves until:
    // - one of them wins, or
    // - the board is full (tie).
    public void start() {
        board.print(); // Print the initial empty board.
        while (true) {
            // Human makes a move.

            human.makeMove(board);
            board.print();

            // Check if there is a winner after human's move.
            char winner = board.checkWinner();
            if (winner != '-') {
                if (winner == 'X') System.out.println("Congratulations, you won!");
                else System.out.println("Oops! The computer won this time.");
                break; // End the game.
            }

            // If no winner but the board is full -> tie.
            if (board.isFull()) { 
                System.out.println("It's a tie!");
                break; // End the game.
            }

            // Computer makes a move.
            computer.makeMove(board); 
            board.print();

            // Check if there is a winner after computer's move.
            winner = board.checkWinner();
            if (winner != '-') {
                if (winner == 'X') System.out.println("Congratulations, you won!");
                else System.out.println("Oops! The computer won this time.");
                break; // End the game.
            }

            // If no winner but the board is full -> tie.
            if (board.isFull()) {
                System.out.println("It's a tie!");
                break; // End the game.
            }
        }
    }
}