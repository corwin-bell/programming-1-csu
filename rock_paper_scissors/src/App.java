import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerScore = 0;
        int computerScore = 0;
        
        while (playerScore < 3 && computerScore < 3) {
            System.out.println("Enter your move (rock, paper, scissors): ");
            String playerMove = scanner.nextLine().toLowerCase();
            
            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("Invalid move, please try again.");
                continue;
            }
            
            int computerMoveInt = random.nextInt(3);
            String computerMove;
            if (computerMoveInt == 0) {
                computerMove = "rock";
            } else if (computerMoveInt == 1) {
                computerMove = "paper";
            } else {
                computerMove = "scissors";
            }
            
            System.out.println("Computer move: " + computerMove);
            
            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
                       (playerMove.equals("paper") && computerMove.equals("rock")) ||
                       (playerMove.equals("scissors") && computerMove.equals("paper"))) {
                System.out.println("You win this round!");
                playerScore++;
            } else {
                System.out.println("Computer wins this round!");
                computerScore++;
            }
            
            System.out.println("Score - Player: " + playerScore + ", Computer: " + computerScore);
        }
        
        if (playerScore == 3) {
            System.out.println("Congratulations! You won the game!");
        } else {
            System.out.println("Sorry, the computer won the game.");
        }
        
        scanner.close();
    }
}

