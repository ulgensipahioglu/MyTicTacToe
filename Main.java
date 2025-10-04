public class Main {
    public static void main(String[] args) {
        // Create a new Game object
        Game game = new Game();

        // Start the game loop
        // This will alternate moves between human and computer
        // until there is a winner or the board is full (tie) 
        game.start();
    }
}
