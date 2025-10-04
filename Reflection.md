Reflection
1. Purpose and Task Solved

The main purpose of the program is to allow a human player to play Tic Tac Toe against the computer. The program achieves this by splitting the game logic into different classes (Board, Player, Game). The game progresses in a loop that checks the board state, receives moves, and prints the board.

2. Frameworks and Libraries Used

No external frameworks were used. Only standard Java library classes were utilized:

java.util.Scanner: To receive row and column input from the human player.

java.util.Random: To allow the computer player to make random valid moves.

java.io.FileWriter: To save total scores (Human Wins, Computer Wins, Ties) to a text file.

java.io.IOException: To handle potential errors during file operations.

java.time.LocalDateTime: To get the current date and time when saving game results.

3. What Went Well and What Could Be Improved

What Went Well:

Object-Oriented Design (OOD): The code is structured into logical classes following Clean Code principles. The Player superclass abstracts shared behavior between HumanPlayer and ComputerPlayer. Each class has a single responsibility.

Usability: Thanks to try-catch blocks in HumanPlayer, the program does not crash on invalid input and allows the user to try again.

Score saving: Results are appended to a file without overwriting previous games.

What Could Be Improved:

Computer AI: Currently, the ComputerPlayer makes only random moves. To improve gameplay and make the computer more challenging, a strategy algorithm such as Minimax could be implemented.

GUI: Adding a graphical interface would improve user experience.