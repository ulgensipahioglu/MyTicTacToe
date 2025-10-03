public class Game {
    private Board board;
    private Players humanPlayers;
    private Players computerPlayers;

public Game(){
    board = new Board();
    humanPlayers = new Players("You", 'X', false);
    computerPlayers = new Players("Computer", 'O', false);
}
    public void start() {
        board.print();
        while (true) {
            humanPlayers.makeMove(board);
            board.print();
            if (board.checkWinner() != '-') 
            {
                System.out.println("Winner is: "+ board.checkWinner());
                break;
            }
            if (board.isFull()) {
                System.out.println("It's a tie!");
                break;
            }

            computerPlayers.makeMove(board);
            board.print();
            if (board.checkWinner() != '-') 
            {
                System.out.println("Winner is: "+ board.checkWinner());
                break;
            }
            if(board.isFull())
            {
                System.out.println("It's a tie!");
                break;
            }
        }
    }
}



