import java.util.Scanner;

public class GalaxyWeatherAdvisor {
    public static void main(String[] args) {
        //declaration and initialization of the scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO YOUR NO. 1 WEATHER ADVISORY CHANNEL");

        //take user input for planets
        System.out.println("\nFrom what planet are you from?");
        String planetName = scanner.nextLine();
        // declaring a string variable to store response
        String advice = "";

        if (planetName.equalsIgnoreCase("Earth")
                || planetName.equalsIgnoreCase("Mars")
                || planetName.equalsIgnoreCase("Venus")
                || planetName.equalsIgnoreCase("Jupiter")) {
            //current temperature input
            System.out.printf("What is the current temperature in %s?\n", planetName);
            // declaring a string variable to store response
            double planetTemp = scanner.nextDouble();

            if (planetTemp < 0) {
                advice = "It is so cold out there. Wear a Cardigan for your safety";
            } else if (planetTemp > 0 && planetTemp < 30) {
                advice = "It's slightly cold out there. You might need to keep warmth for some time";
            } else if (planetTemp > 30 && planetTemp < 100) {
                advice = "The weather is quite hot! Kindly keep cool.";
            } else if (planetTemp > 100) {
                advice = "If you don't find cover now, you will SOON DIE!";
            }

        } else {
            advice = "Unknown planet! Kindly enter a valid planet.";
        }
        System.out.println(advice);

        //close scanner object
        scanner.close();
    }
}
