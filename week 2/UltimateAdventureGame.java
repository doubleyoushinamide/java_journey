import java.util.Scanner;

public class UltimateAdventureGame {
    // Enum to represent different actions in the adventure game
    enum Direction {
        NORTH, SOUTH, EAST, WEST, QUIT
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        Direction direction; // Variable to store the player's direction

        // Introduction to the game
        System.out.println("Welcome to the Ultimate Adventure Game!");
        System.out.println("You find yourself in a dark forest. Choose a direction to explore.");
        System.out.println("Type NORTH, SOUTH, EAST, WEST to move or QUIT to exit.");

        // Game loop: keep asking the player to choose a direction until they quit
        for (;;) {
            System.out.print("Enter a direction: ");
            String input = scanner.nextLine().toUpperCase(); // Convert user input to uppercase for case-insensitivity

            try {
                // Try to parse the input into the Direction enum
                direction = Direction.valueOf(input);

                // Use a switch statement to handle the player's choice
                switch (direction) {
                    case NORTH:
                        System.out.println("You head north and find a tall mountain blocking your path.");
                        break;
                    case SOUTH:
                        System.out.println("You head south and discover a serene lake shimmering in the sunlight.");
                        break;
                    case EAST:
                        System.out.println("You move east and stumble upon an ancient abandoned temple.");
                        break;
                    case WEST:
                        System.out.println("You journey west and encounter a dense and eerie forest.");
                        break;
                    case QUIT:
                        System.out.println("Thank you for playing the Ultimate Adventure Game. Goodbye!");
                        scanner.close(); // Close the scanner before exiting
                        return; // Exit the method, ending the game
                }
            } catch (IllegalStateException | IllegalArgumentException e) {
                // If the input is invalid, prompt the user again
                System.out.println("Invalid direction! Please enter NORTH, SOUTH, EAST, WEST, or QUIT.");
            }

    }
}}
