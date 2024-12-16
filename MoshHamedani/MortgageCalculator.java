import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declaring and initializing constants
        byte MONTHS_IN_A_YEAR = 12;
        byte PERCENTAGE = 100;

        //get first value = principal
        System.out.print("Principal: ");
        int principal = scanner.nextInt(); // 4bytes enough
        scanner.nextLine(); //consumes the nextInt method

        //get second value = interest rate
        System.out.print("Annual Interest Rate: ");
        float rate = scanner.nextFloat(); // 4bytes enough
        float newRate = rate * MONTHS_IN_A_YEAR;

        //make the 1+r
        float onePlusRate = 1 + newRate;

        //get third value = period accepts yearly but formated as monthly
        System.out.print("Period (Year): ");
        int period = scanner.nextInt(); // 4bytes enough
        scanner.nextLine(); //consumes new line

        double  newPeriod = (double) period / (MONTHS_IN_A_YEAR * PERCENTAGE); //explicit casting

        //Mortgage Calculation
        double mortgage = principal * ((newRate * Math.pow(onePlusRate, newPeriod))
                / (Math.pow(onePlusRate, newPeriod) - 1));
        String parsedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

        //Print Output
        System.out.println("Mortgage: " + parsedMortgage);

        scanner.close();
    }
}
