import java.util.Scanner;

// Main class to run the game
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvancedWordGuessingGame game = new AdvancedWordGuessingGame();

        System.out.println("Welcome to the Word Guessing Game!");
        System.out.println("Try to guess the word. After each incorrect guess, you'll get a hint!");

        while (!game.isWordGuessed()) {
            game.displayRevealedWord();
            System.out.print("Enter your guess (single letter): ");
            char guess = scanner.nextLine().charAt(0);

            if (!game.processGuess(guess)) {
                System.out.println("Keep trying!");
            }
        }

        System.out.println("\nCongratulations! You guessed the word: " + game.selectedWord);
        game.displayFinalStats();
        scanner.close();
    }
}
