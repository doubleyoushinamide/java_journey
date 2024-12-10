import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        //declaration and initiation of a scanner object
        Scanner scanner = new Scanner(System.in);
        //declaring important variables
        int vowels = 0, consonants = 0, capitalCase = 0, lowerCase = 0;
        String vowelList = "aeiouAEIOU";
        //output prompt message
        System.out.println("Enter a String:");
        //capture input
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            //ask if user still wants to continue
            System.out.println("Are you still interested in playing?");
            String response = scanner.nextLine().toLowerCase();

            if (response.equals("no")) {
                break;
            } else {
                if (!Character.isLetter(ch)){
                    continue;
                }
                if (Character.isUpperCase(ch)) {
                    capitalCase++;
                } else {
                    lowerCase++;
                }
                if (vowelList.indexOf(ch) !=1) { //if a vowel matches current iteration
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Total count of Vowels: " + vowels);
        System.out.println("Total count of Consonants: " + consonants);
        System.out.println("Total count of UpperCases: " + capitalCase);
        System.out.println("Total count of lowerCases: " + lowerCase);

        scanner.close(); //best practices

    }
}
