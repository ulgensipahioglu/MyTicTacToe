import java.io.FileWriter; // FileWriter class is used to write text to a file
import java.io.IOException; // IOException is used to handle errors during file operations
import java.time.LocalDateTime; // LocalDateTime class is used to get current date and time


public class ScoreSaver {


    // This method saves the game result to a text file
    // The 'winner' parameter can be "Human", "Computer" or "Tie"
    public static void main(String winner) {
        try {
            // Create a FileWriter in append mode (true) so previous results are not erased
            FileWriter writer = new FileWriter("game_scores.txt", true);
            
            // Get the current date and time
            LocalDateTime now = LocalDateTime.now();

            // Prepare the string to write: date + winner
            String result = now + "- Winner: " + winner + "\n";

            // Write the result to the file
            writer.write(result);

            // Close the file to save changes and free resources
            writer.close();
        }
        catch (IOException e) {
            // If an error occurs while writing to the file, show a message
            System.out.println("Error saving the result!");
        }
    }
    
}
