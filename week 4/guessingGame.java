import java.sql.SQLOutput;
import java.util.Scanner;

class guessingGame{
    public static void main(String[] args) throws InterruptedException {
        //1. Create the scanner object/instance
        Scanner scanner = new Scanner(System.in);

        //2. Print the Welcome message
        // 2a. Ask for username
        System.out.print("What is your first name: ");
        String playerName = scanner.next();
        //2b. Print a formatted message for the player
        System.out.print("You are Welcome " + playerName + " are you ready? ");
        String playerResponse = scanner.next().toLowerCase();
        if (playerResponse.equals("yes")){
            System.out.println("Thank you!");
            //3. Guess of the computer or host player
            int guessedNum = (int) (Math.random() * 100 + 1);
            //4. Loop that counts the thinking procedure of the computer
            System.out.println("Please wait while I think of a number.");
            //5. Printing progress bar
            for (int i=0; i < 5; i++) {
                System.out.print("===>");
                Thread.sleep(1000);
            }

            //6. Guess what is on host's mind
            System.out.println("\nNow guess the number on my mind? (NO TIPS!)");
            int firstGuess = scanner.nextInt(); scanner.nextLine();
            if (firstGuess == guessedNum) {
                System.out.println("WOW! You must be a PROPHET!");
            } else {
                int i = 4;
                while (i > 0) {
                    i--;
                    System.out.println("Not every warrior succeeds in their first battle\nThat is if they have another chance");
                    if (i != 0) {
                        System.out.println("You have " + i + " more chances to guess right");
                        int secondGuess = scanner.nextInt();
                        scanner.nextLine();
                        if (secondGuess > guessedNum) {
                            System.out.println("-----> TOO HIGH!");
                        } else if (secondGuess < guessedNum) {
                            System.out.println("-----> TOO LOW!");
                        } else {
                            System.out.println("Correct!");
                            break;
                        }
                    } else {
                        System.out.println("This is your final chance to guess");
                        int secondGuess = scanner.nextInt();
                        scanner.nextLine();
                        if (secondGuess > guessedNum) {
                            System.out.println("----> TOO HIGH!");
                        } else if (secondGuess < guessedNum) {
                            System.out.println("----> TOO LOW!");
                        } else {
                            System.out.println("----> Correct! GOOD JOB!");
                            break;
                        }
                    }
                }
                System.out.println("-------------------------");
                System.out.println("\t\tGAME OVER!");
                System.out.println("-------------------------");
            }
        } else
            System.out.println("I wished you played this game but all the same, thank you!");
    }
}