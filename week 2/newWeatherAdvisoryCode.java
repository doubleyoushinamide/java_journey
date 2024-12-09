import java.util.Scanner;

public class newWeatherAdvisoryCode {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the name of the planet
        System.out.println("Enter the name of the planet (Mercury, Venus, Earth, Mars):");
        String planet = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison

        // Store replies or responses here
        String reply;
        double tempCelsius = 0.0;

        // If-else block statements
        switch (planet) {
            case "mercury" -> {
                System.out.printf("Welcome to %s.\nKindly Input the Temperature in Celsius:\n", planet);
                tempCelsius = scanner.nextDouble(); // Correct assignment instead of `+=`

                if (tempCelsius > 350) {
                    reply = "Warning: Extremely hot! Stay inside.";
                } else if (tempCelsius > 200) {
                    reply = "Very hot weather! Wear protective gear.";
                } else {
                    reply = "Temperature is moderate for Mercury.";
                }
            }
            case "venus" -> {
                System.out.printf("Welcome to %s.\nKindly Input the Temperature in Celsius:\n", planet);
                tempCelsius = scanner.nextDouble();
                if (tempCelsius > 450) {
                    reply = "Warning: Extreme temperatures on Venus! Uninhabitable.";
                } else if (tempCelsius > 300) {
                    reply = "Very hot, avoid any outdoor activities.";
                } else {
                    reply = "Temperature is unusually low for Venus.";
                }
            }
            case "earth" -> {
                System.out.printf("Welcome to %s.\nKindly Input the Temperature in Celsius:\n", planet);
                tempCelsius = scanner.nextDouble();
                if (tempCelsius > 40) {
                    reply = "It's a heatwave! Stay hydrated.";
                } else if (tempCelsius < 0) {
                    reply = "Freezing temperatures! Bundle up!";
                } else {
                    reply = "Nice weather! Enjoy your day.";
                }
            }
            case "mars" -> {
                System.out.printf("Welcome to %s.\nKindly Input the Temperature in Celsius:\n", planet);
                tempCelsius = scanner.nextDouble();
                if (tempCelsius > 20) {
                    reply = "Warm for Mars, enjoy the day.";
                } else if (tempCelsius < -50) {
                    reply = "It's freezing! Be careful.";
                } else {
                    reply = "Chilly but bearable.";
                }
            }
            default -> reply = "Planet not recognized. Please enter one of the listed planets.";
        }

        // Printing out the reply of the true block
        System.out.println(reply);

        // Ternary conditional statement for threshold warning
        String thresholdStatement = (tempCelsius > 50)
                ? "Note: Make sure to check your equipment for overheating."
                : "Everything seems fine";
        System.out.println(thresholdStatement);

        // Close the scanner object
        scanner.close();
    }
}

