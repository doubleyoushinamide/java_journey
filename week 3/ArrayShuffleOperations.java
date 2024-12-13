// Importing necessary Java package for utility functions
import java.util.Random;
import java.util.Arrays;

public class ArrayShuffleOperations {
    public static void main(String[] args) {
        // Declare and initialize an array with 10 integers
        int[] numbers = {12, 43, 56, 78, 34, 23, 89, 90, 65, 31};

        // Display the original array
        int[] originalArray = Arrays.copyOf(numbers, numbers.length);

        //shuffled array
        int[] shuffledArrays = shuffleArray(originalArray);
        System.out.print("Here are the Shuffled Array: ");
        for (int shuffled : shuffledArrays) {
            System.out.print(shuffled + " ");
        }

        // Find and display the sum, minimum, and maximum of the array
        //sum
        System.out.println("\nSum of Arrays: " + calculateSum(originalArray));
        //minimum
        System.out.println("Minimum value of the array: " + findMin(originalArray));
        //maximum

        System.out.println("Maximum value of the array: " + findMax(originalArray));
        // Sort the array and display the sorted array
        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

    }

    // Method to shuffle the array
    public static int[] shuffleArray(int[] array) {
        Random random = new Random();
        //int[] shuffledArray = array.clone();
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap the elements
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            //TODOs
            //return array;
        }
        return array;
    }

    // Method to calculate the sum of the array
    public static int calculateSum(int[] array) {
        int sumArray = 0;
        for (int j : array) {
            sumArray += j;
        }
        return sumArray;
    }

    // Method to find the minimum value in the array
    public static int findMin(int[] array) {
        //TODOs
        int minimum = array[0];
        for (int j : array) {
            if (j <= minimum) {
                minimum = j;
            }
        }
        return minimum;
    }

    // Method to find the maximum value in the array
    public static int findMax(int[] array) {
        //TODOs
        int maximum = array[0];
        for (int j : array) {
            if (j > maximum) {
                maximum = j;
            }
        }
        return maximum;
    }
}