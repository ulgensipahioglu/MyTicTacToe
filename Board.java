public class Board {

    private char [][] board; //Board's matrix

    public Board(){
        board = new char [3][3]; //creat empty board
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++){
                board[i][j] = '-'; // to make it look empty
            }
        }
    }

    public void print(){ //print to screen
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(board[i][j] + " "); //for space
            }
            System.out.println();
        }
    }

    public boolean makeMove(int row, int col, char symbol) {
        if (board[row][col] == '-') { // if place is empty you can make move
            board[row][col] = symbol;
            return true;
        }
        return false;
    }

    public boolean isFull() { // to control board for full
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                if (board[i][j] == '-')
                return false;
            }
        }
        return true;
    }

    public char checkWinner () { //check board
        for (int i = 0; i<3; i++){
            //for row and col
            if (board[i][0] != '-' && board[i][0] == board[i][0] && board[i][0] == board[i][0])
            return board[i][0];
            if (board[0][i] != '-' && board[0][i] == board[0][i] && board[0][i] == board[0][i])
            return board[0][i]; 
        }

        //for crosses
            if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return board[0][0];
            if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][2])
            return board[0][2];

            return '-'; // no winner
    }

}