import java.util.Scanner;

// Main class to start the game
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the target score to achieve: ");
        int targetScore = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        DiceGame game = new DiceGame(targetScore);
        game.playGame();
    }
}