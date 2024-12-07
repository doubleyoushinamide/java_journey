import java.util.Scanner;

public class chatBot {
    public static void main (String[] arg) {
        //Creating scanner object
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter their input
        System.out.println("Kindly enter your input here");
        // Read the user's input and store it in the variable userInput
        String userInput = scanner.nextLine();

        // Check if the user's input is a greeting (e.g., "hello" or "hi")
        if (userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi")) {
            System.out.println("Hello to you.\nTrust you're doing very fine?");
        }

        // Check if the user's input is an inquiry about well-being (e.g., "how are you" or "how's it going")
        else if (userInput.equalsIgnoreCase("how are you") || userInput.equalsIgnoreCase("how's it going")) {
            // and display a relevant response
            System.out.println("I am doing very well, thanks.\n How may I be of Help to you?");
        }

        // Check if the user's input is about the weather (e.g., "what's the weather like" or "weather")
        // and display a relevant response
        else if (userInput.equalsIgnoreCase("what's the weather like") || userInput.equalsIgnoreCase("weather")) {
            // and display a relevant response
            System.out.println("The weather outside is dry!");
        }
        // Check if the user's input is a farewell (e.g., "bye" or "goodbye")
        else if (userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("goodbye")) {
            // and display a relevant response
            System.out.println("Thank you for using our service");
        }

        // If the user's input doesn't match any of the predefined options, respond with a default message
        /*else {
            System.out.println("I don't Understand you!");
        }*/

        // If the user's input doesn't match any of the predefined options, respond with a default message
        if (!userInput.equalsIgnoreCase("hello") && !userInput.equalsIgnoreCase("hi") &&
                !userInput.equalsIgnoreCase("how are you") && !userInput.equalsIgnoreCase("how's it going") &&
                !userInput.equalsIgnoreCase("what's the weather like") && !userInput.equalsIgnoreCase("weather") &&
                !userInput.equalsIgnoreCase("bye") && !userInput.equalsIgnoreCase("goodbye")) {
            System.out.println("Chatbot: I'm sorry, I don't understand that.");
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}