import java.text.NumberFormat;
import java.util.Scanner;

public class AdvancedMortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declaring and initializing constants
        byte MONTHS_IN_A_YEAR = 12;
        byte PERCENTAGE = 100;

        //declaring and initializing outer vars
        int principal = 0;

        while (true) {
            //get first value = principal
            System.out.print("Principal (between $1,000 and $1,000,000): ");
            principal += scanner.nextInt(); // 4bytes enough
            scanner.nextLine(); //consumes the nextInt method
            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            } else
                System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        float newRate = 0;

        while (true) {
            //get second value = interest rate
            System.out.print("Annual Interest Rate (between 0 and 100): ");
            float rate = scanner.nextFloat(); // 4bytes enough
            if (rate < 100) {
                newRate += (rate * MONTHS_IN_A_YEAR);
                break;
            } else
                System.out.println("Enter a number less than 100");
        }

        double  newPeriod = 0; //explicit casting

        while (true) {
            //get third value = period accepts yearly but formated as monthly
            System.out.print("Period (Year): ");
            int period = scanner.nextInt(); // 4bytes enough
            scanner.nextLine(); //consumes new line
            if (period > 0 && period < 13) {
                newPeriod += (double) period / (MONTHS_IN_A_YEAR * PERCENTAGE);
                break;
            } else
                System.out.println("Enter a valid month number (between 1 and 12): ");
        }

        //make the 1+r
        float onePlusRate = (1 + newRate);
        //Mortgage Calculation
        double mortgage = principal * ((newRate * Math.pow(onePlusRate, newPeriod))
                / (Math.pow(onePlusRate, newPeriod) - 1));
        String parsedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

        //Print Output
        System.out.println("Mortgage: " + parsedMortgage);

        //for troubleshooting
        /*
        System.out.println(principal);
        System.out.println(newRate);
        System.out.println(newPeriod);
        System.out.println(onePlusRate); */

        scanner.close();
    }
}
