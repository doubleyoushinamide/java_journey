// Import necessary Java packages
import java.util.Random;

public class exercise {

    public void spaceTravelSimulator() {
        // Declare and initialize a 2D array representing sectors in space
        String[][] spaceGrid = {
                {"Empty", "Asteroids", "Planet"},
                {"Alien Ship", "Empty", "Space Station"},
                {"Comet", "Black Hole", "Empty"}
        };

        // Display the initial state of the space grid
        System.out.println("Initial State of the Space Grid:");
        displayGrid(spaceGrid);

        // Simulate traveling through space by visiting random sectors
        Random random = new Random();
        int totalEvents = 5;

        System.out.println("\nSimulating Space Travel:");
        for (int i = 0; i < totalEvents; i++) {
            // Get random row index
            int row = random.nextInt(spaceGrid.length);
            // Get random column index
            int col = random.nextInt(spaceGrid[0].length);

            System.out.println("Visiting sector [" + row + "][" + col + "]: " + spaceGrid[row][col]);
        }

        // Calculate the number of "Empty" sectors
        int emptyCount = countEmptySectors(spaceGrid);
        System.out.println("\nNumber of 'Empty' sectors: " + emptyCount);

        // Find the largest "event" (based on ASCII comparison) in the space grid
        String largestEvent = findLargestEvent(spaceGrid);
        System.out.println("Largest event in the space grid: " + largestEvent);
    }

    // Method to display the space grid
    public void displayGrid(String[][] grid) {
        for (String[] row : grid) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }

    // Method to count the number of "Empty" sectors in the space grid
    public int countEmptySectors(String[][] grid) {
        int count = 0;
        for (String[] row : grid) {
            for (String cell : row) {
                if (cell.equals("Empty")) {
                    count++;
                }
            }
        }
        return count;
    }

    // Method to find the largest event in the space grid (lexicographically)
    public String findLargestEvent(String[][] grid) {
        String largest = "";
        for (String[] row : grid) {
            for (String cell : row) {
                if (cell.compareTo(largest) > 0) {
                    largest = cell;
                }
            }
        }
        return largest;
    }

    // Main method to run the simulation
    public static void main(String[] args) {
        exercise exercise = new exercise();
        exercise.spaceTravelSimulator();
    }
}
