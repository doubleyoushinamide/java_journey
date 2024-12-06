import java.util.Scanner;

public class MainString{
    public static void main(String arg[]) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a full sentence
        System.out.println("Enter a full sentence:");
        String sentence = scanner.nextLine();

        // Print the length of the sentence
        //TODO
        int lengthSentence = sentence.length();
        System.out.println("The lenght of the sentence is: " + lengthSentence);

        // Print the first and last character of the sentence
        //TODO
        System.out.println("The first character of the sentence is: " + sentence.charAt(0));
        char lastChar = sentence.charAt(sentence.length() - 1);
        System.out.println("The last character of the sentence is: " + lastChar);

        // Ask for another string to compare
        //TODO
        System.out.println("\nEnter another sentence to compare:");
        String sentence2 = scanner.nextLine();

        // Compare the two sentences using equals and equalsIgnoreCase
        //TODO
        boolean compare1 = sentence.equals(sentence2);
        boolean compare2 = sentence.equalsIgnoreCase(sentence2);
        int compare3 = sentence2.compareTo(sentence);
        
        if (compare1 || compare2) {
            System.out.println("The two sentences are the same, ignoring case (equalsIgnoreCase).");
        }
        
        // Lexicographical comparison using compareTo
        //TODO
        if (compare3 > 0) {
            System.out.println("The first sentence is lexicographically greater.");
        } else if (compare3 < 0) {
            System.out.println("The first sentence is lexicographically less.");
        } else {
            System.out.println("The two sentences are lexicographically equal.");
        }

        // Demonstrate substring and replace methods
        //TODO
        System.out.println("\nEnter a word to replace in the first sentence:");
        String wordToReplace = scanner.nextLine();
        //replacement word
        System.out.println("\nEnter the replacement word:");
        String replacementWords = scanner.nextLine();
        
        String word1 = sentence.replace(wordToReplace, replacementWords);
        
        System.out.println("Modified sentence: " + word1);

        // Convert sentence to upper and lower case
        //TODO
        System.out.println("Uppercase version: " + sentence.toUpperCase());
        System.out.println("Lowercase version: " + sentence.toLowerCase());

        // Formatting with strings and numbers
       //TODO
        System.out.println("\nEnter an interest rate:");
        double interestRate = scanner.nextDouble();
        
        //formated interest rate (%)
        System.out.printf("The formatted interest rate is: %.2f%%", interestRate);
    
    //cloase scanner
    scanner.close();
        }
}
