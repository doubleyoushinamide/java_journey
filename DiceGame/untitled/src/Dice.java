import java.util.Random;

// Class representing a single dice
class Dice {
    private final Random random;

    public Dice() {
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(6) + 1; // Generates a random number between 1 and 6
    }
}
