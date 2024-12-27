//parent class
import java.util.Arrays;
import java.util.Random;

// Base class for the Word Guessing Game
class WordGame {
    protected String[] wordPool = {"java", "inheritance", "polymorphism", "abstraction", "encapsulation"};
    protected String selectedWord;
    protected char[] revealedWord;
    protected int attempts;

    public WordGame() {
        Random random = new Random();
        selectedWord = wordPool[random.nextInt(wordPool.length)];
        revealedWord = new char[selectedWord.length()];
        // Initialize with dashes
        Arrays.fill(revealedWord, '-');
        attempts = 0;
    }

    // Method to display the current state of the revealed word
    public void displayRevealedWord() {
        System.out.println("Current Word: " + new String(revealedWord));
    }

    // Method to check if the word is guessed correctly
    public boolean isWordGuessed() {
        return new String(revealedWord).equals(selectedWord);
    }

    // Method to process the user's guess
    public boolean processGuess(char guess) {
        boolean isCorrect = false;
        for (int i = 0; i < selectedWord.length(); i++) {
            if (selectedWord.charAt(i) == guess && revealedWord[i] == '-') {
                revealedWord[i] = guess;
                isCorrect = true;
            }
        }
        attempts++;
        return isCorrect;
    }
}

