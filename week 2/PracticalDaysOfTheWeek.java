import java.util.Scanner;

public class PracticalDaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the day of the week that you are in");
        int day = scanner.nextInt();

        String message = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day of the week";

        };

        System.out.println(message);
        scanner.close();
    }
}
