import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalculator; //loop decider!

        //using a do while loop to at least execute once.
        // Infinite loop to keep the calculator running until the user decides to quit
        do {
            try {
                // Prompt the user to enter two numbers
                System.out.println("Enter first Number: ");
                double firstNum = Double.parseDouble(scanner.nextLine()); //but we are going to combine with nextLine() later on

                System.out.println("Enter second Number: ");
                double secondNum = Double.parseDouble(scanner.nextLine());

                // Prompt the user to choose an operation
                System.out.println("Enter an operation: (Either +, -, *, or /) ");
                String operator = scanner.nextLine(); //string so nextLine is enough

                // Perform the selected operation using a switch statement
                // Display the result if the operation was valid
                double result;
                switch (operator) {
                    case ("+"):
                        result = firstNum + secondNum;
                        //display the result
                        System.out.println("Result: " + result);
                        break; //best practices
                    case ("-"):
                        result = firstNum - secondNum;
                        //display the result
                        System.out.println("Result: " + result);
                        break; //best practices
                    case ("*"):
                        result = firstNum * secondNum;
                        //display the result
                        System.out.println("Result: " + result);
                        break; //best practices
                    case ("/"):
                        // What if the secondNum is 0? we will fall into an error.
                        if (secondNum != 0) {
                            result = firstNum / secondNum;
                            //display the result
                            System.out.println("Result: " + result);
                            break; //best practices
                        } else {
                            System.out.println("Invalid second number. Kindly input a non zero value");
                        }
                    default:
                        System.out.println("Invalid operator. Use only +, -, *, or / alone");

                }
                // Ask the user if they want to perform another calculation
                //TODOs
                System.out.println("Do you want to perform another calculation?");
                continueCalculator = scanner.nextLine();

            } catch (RuntimeException e) {
                System.out.println("Error! try and use either +, -, *, or / operations ");
                //go back to the loop
                continueCalculator = "yes";
            }
        } while (continueCalculator.equalsIgnoreCase("yes"));



        // End the program
        System.out.println("Calculator session ended. Goodbye!");
    }
}
