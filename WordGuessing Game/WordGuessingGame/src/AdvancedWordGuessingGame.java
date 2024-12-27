// Multilevel inheritance for advanced game features
class AdvancedWordGuessingGame extends WordGuessingGame {
    private int incorrectAttempts;

    public AdvancedWordGuessingGame() {
        super();
        incorrectAttempts = 0;
    }

    @Override
    public boolean processGuess(char guess) {
        boolean isCorrect = super.processGuess(guess);
        if (!isCorrect) {
            incorrectAttempts++;
            System.out.println("Incorrect guess! Total incorrect attempts: " + incorrectAttempts);
            provideHint();
        }
        return isCorrect;
    }

    public void displayFinalStats() {
        System.out.println("Game Over!");
        System.out.println("Total attempts: " + attempts);
        System.out.println("Incorrect attempts: " + incorrectAttempts);
    }
}

