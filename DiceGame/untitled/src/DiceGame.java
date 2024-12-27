import java.util.Scanner;

// Class to manage the dice game logic
class DiceGame {
    private final Dice dice1;
    private final Dice dice2;
    private int totalScore;
    private final int targetScore;

    public DiceGame(int targetScore) {
        this.dice1 = new Dice();
        this.dice2 = new Dice();
        this.totalScore = 0;
        this.targetScore = targetScore;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        int rollCount = 0;

        System.out.println("Welcome to the Roll-Dice Game!");
        System.out.println("Your goal is to reach or exceed the target score: " + targetScore);
        System.out.println("You have a maximum of 5 rolls. Let's begin!\n");

        while (rollCount < 5) {
            System.out.print("Press 'R' to roll the dice or 'S' to stop the game: ");
            String userInput = scanner.nextLine().trim().toUpperCase();

            if (userInput.equals("S")) {
                System.out.println("You chose to stop the game.");
                break;
            } else if (!userInput.equals("R")) {
                System.out.println("Invalid input! Please press 'R' to roll or 'S' to stop.");
                continue;
            }

            rollCount++;
            int dice1Value = dice1.roll();
            int dice2Value = dice2.roll();
            int rollScore = dice1Value + dice2Value;
            //display
            System.out.println("\nRoll " + rollCount + ":");
            System.out.println("Dice 1: " + dice1Value + ", Dice 2: " + dice2Value);
            System.out.println("Roll Score: " + rollScore);
            //double roll bonus
            if (dice1Value == dice2Value) {
                System.out.println("Double rolled! Bonus of 5 points awarded.");
                rollScore += 5;
            }

            totalScore += rollScore;
            System.out.println("Total Score: " + totalScore);

            if (totalScore == targetScore) {
                System.out.println("\nCongratulations! You've reached the target score of " + targetScore + "!");
                break;
            } else if (totalScore > targetScore) {
                System.out.println("\nYou have exceeded your target.");
                break;
            }

            System.out.println();
        }

        System.out.println("\nGame Over!");
        System.out.println("Your final score is: " + totalScore);
        scanner.close();
    }
}