import java.util.Scanner;

public class newWeatherAdvisoryCode {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the name of the planet
        System.out.println("Enter the name of the planet (Mercury, Venus, Earth, Mars):");
        String planet = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison

        // Store replies or responses here
        String reply = "";
        double tempCelcius = 0.0;

        // If-else block statements
        if (planet.equals("mercury")) {
            System.out.printf("Welcome to %s.\nKindly Input the Temperature in Celsius:\n", planet);
            tempCelcius = scanner.nextDouble(); // Correct assignment instead of `+=`
            if (tempCelcius > 350) {
                reply = "Warning: Extremely hot! Stay inside.";
            } else if (tempCelcius > 200) {
                reply = "Very hot weather! Wear protective gear.";
            } else {
                reply = "Temperature is moderate for Mercury.";
            }
        } else if (planet.equals("venus")) {
            System.out.printf("Welcome to %s.\nKindly Input the Temperature in Celsius:\n", planet);
            tempCelcius = scanner.nextDouble();
            if (tempCelcius > 450) {
                reply = "Warning: Extreme temperatures on Venus! Uninhabitable.";
            } else if (tempCelcius > 300) {
                reply = "Very hot, avoid any outdoor activities.";
            } else {
                reply = "Temperature is unusually low for Venus.";
            }
        } else if (planet.equals("earth")) {
            System.out.printf("Welcome to %s.\nKindly Input the Temperature in Celsius:\n", planet);
            tempCelcius = scanner.nextDouble();
            if (tempCelcius > 40) {
                reply = "It's a heatwave! Stay hydrated.";
            } else if (tempCelcius < 0) {
                reply = "Freezing temperatures! Bundle up!";
            } else {
                reply = "Nice weather! Enjoy your day.";
            }
        } else if (planet.equals("mars")) {
            System.out.printf("Welcome to %s.\nKindly Input the Temperature in Celsius:\n", planet);
            tempCelcius = scanner.nextDouble();
            if (tempCelcius > 20) {
                reply = "Warm for Mars, enjoy the day.";
            } else if (tempCelcius < -50) {
                reply = "It's freezing! Be careful.";
            } else {
                reply = "Chilly but bearable.";
            }
        } else {
            reply = "Planet not recognized. Please enter one of the listed planets.";
        }

        // Printing out the reply of the true block
        System.out.println(reply);

        // Ternary conditional statement for threshold warning
        String thresholdStatement = (tempCelcius > 50)
                ? "Note: Make sure to check your equipment for overheating."
                : "Everything seems fine";
        System.out.println(thresholdStatement);

        // Close the scanner object
        scanner.close();
    }
}

