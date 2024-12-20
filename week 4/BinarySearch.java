import java.util.Arrays;
import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect and process the array
        int[] returnee = manipulateArrays.collection();
        int[] sortedReturnee = manipulateArrays.duplicateNumbers(returnee);
        System.out.println("Sorted array without duplicates: " + Arrays.toString(sortedReturnee));

        while (true) {
            System.out.println("Do you wish to continue? (Yes or No)");
            String answer = scanner.next().toLowerCase();
            scanner.nextLine(); // Consume the newline

            if (answer.equals("yes")) {
                System.out.println("Enter the number you want to find:");
                if (scanner.hasNextInt()) {
                    int targetNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    int searchIndex = manipulateArrays.binarySearch(sortedReturnee, 0, sortedReturnee.length - 1, targetNumber);
                    if (searchIndex != -1) {
                        System.out.println("YES! Your number is at index " + searchIndex + " of the array.");
                    } else {
                        System.out.println("The number you are looking for cannot be found!");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear invalid input
                }
            } else if (answer.equals("no")) {
                System.out.println("Thanks for using our application. Goodbye!");
                break;
            } else {
                System.out.println("Invalid response. Please enter 'Yes' or 'No'.");
            }
        }
    }
}
