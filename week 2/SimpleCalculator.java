import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalculator;

        // Infinite loop to keep the calculator running until the user decides to quit
        do {
            try {
                // Prompt the user to enter two numbers
                System.out.println("Enter First Number: ");
                double firstNumber = Double.parseDouble(scanner.nextLine());

                System.out.println("Enter Second Number: ");
                double secondNumber = Double.parseDouble(scanner.nextLine());

                // Prompt the user to choose an operation
                System.out.println("Choose an operation +, -, *, or /: ");
                String operation = scanner.nextLine();

                // Perform the selected operation using a switch statement
                double result;
                switch (operation) {
                    case ("+"):
                        result = firstNumber + secondNumber;
                        System.out.println("Results: " + result);
                        break;
                    case ("-"):
                        result = firstNumber - secondNumber;
                        System.out.println("Results: " + result);
                        break;
                    case ("*"):
                        result = firstNumber * secondNumber;
                        System.out.println("Results: " + result);
                        break;
                    case ("/"):
                        if (secondNumber != 0) {
                            result = firstNumber / secondNumber;
                            System.out.println("Results: " + result);
                        }
                        else
                            System.out.println("Invalid input! Do not divide by a non zero integer");
                        break;
                    default:
                        System.out.println("Input a valid numbers only!");

                }

                // Ask the user if they want to perform another calculation
                System.out.println("Do you want to perform another calculation?");
                continueCalculator = scanner.nextLine().toLowerCase();

                //TODOs
            } catch (RuntimeException e) {
                System.out.println("I will refer you back to the program!");
                continueCalculator = "yes";
            }
        } while (continueCalculator.equalsIgnoreCase("yes"));

        // End the program
        System.out.println("Calculator session ended. Goodbye!");
        scanner.close(); //best practice
    }
}