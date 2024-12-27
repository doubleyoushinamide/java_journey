import java.util.Random;

//subclass
// Single-level inheritance for adding hint functionality
class WordGuessingGame extends WordGame {
    private final Random random;

    public WordGuessingGame() {
        super();
        random = new Random();
    }

    // Method to reveal a random letter as a hint
    public void provideHint() {
        while (true) {
            int randomIndex = random.nextInt(selectedWord.length());
            if (revealedWord[randomIndex] == '-') {
                revealedWord[randomIndex] = selectedWord.charAt(randomIndex);
                System.out.println("Hint: Revealed letter at position " + (randomIndex + 1));
                break;
            }
        }
    }
}

