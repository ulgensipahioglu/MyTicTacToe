public class Board {

    private char [][] board;
    // 2D array representing the Tic Tac Toe board.
    // Each cell holds a character: '-', 'X', or 'O'.

    
     // Constructor
     // Initializes a 3x3 board and fills it with '-' (empty cells).
        public Board(){
        board = new char [3][3];
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++){
                board[i][j] = '-'; 
            }
        }
    }
    

    public void print(){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(board[i][j] + " "); 
            }
            System.out.println();
        }
    }
    // Prints the current board state to the console.
    // Each cell is separated by a space to make the grid clear.


    
    // Attempts to place the given symbol at the specified position.
    // Returns true if the move is valid and successful, false otherwise.
    public boolean makeMove(int row, int col, char symbol) {
        if (row<0 || row>=3 || col<0 || col>=3){ 
            return false; 
        // Check if the position is within the board boundaries (0–2).

        }
        if (board[row][col] == '-') { 
            board[row][col] = symbol;
            return true;
            // Check if the chosen cell is empty.

        }
        if (board[row][col] != '-') {
            return false;
        }
        // If the cell is already occupied, the move is invalid.

        return false;
    }

    // Checks if the board is completely filled with no empty cells left.
    public boolean isFull() {
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                if (board[i][j] == '-')
                return false;
            }
        }
        return true;
    }


    // Checks if there is a winner on the board.
    // Returns 'X' or 'O' if there is a winner, or '-' if there is none.
    public char checkWinner () {
        // Check rows and columns.
        for (int i = 0; i<3; i++){
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) // for row
            return board[i][0]; // // return symbol X or O
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) // for col
            return board[0][i]; // return symbol X or O
        }
        // Check diagonals.
            if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return board[0][0]; // // return symbol X or O
            if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return board[0][2]; // // return symbol X or O

            return '-'; // No winner found.

    }

}