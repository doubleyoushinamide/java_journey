//importing Scanner class from java utilities
import java.util.Scanner;

public class BudgetTracker {
    public static void main(String[] arg) {
        //create a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhat is your monthly income in Naira?");
        double response = scanner.nextDouble();

        //total money paid on rent and groceries
        // double rent, groceries;
        System.out.println("What is your total expenses paid on rent?");
        double rent = scanner.nextDouble();
        System.out.println("What is your total expenses paid on Groceries?");
        double groceries = scanner.nextDouble();

        //total money paid on transportation and entertainment
        // double transportation, entertainment;
        System.out.println("What is your total expenses paid on transportation?");
        double transportation = scanner.nextDouble();
        System.out.println("What is your total expenses paid on entertainment?");
        double entertainment = scanner.nextDouble();

        //calculating total expenses
        double totalExpenses = (rent + groceries + transportation + entertainment);
        System.out.printf("The total Expenses is: %s NGN", totalExpenses);

        //Calculating remaining budget
        double remainingBudget = response - totalExpenses;
        System.out.printf("Your remaining budget is: %s NGN ", remainingBudget);

        //Calculating percentage of income spent on each category
        double percentRent = (rent / response) * 100;
        double percentGroceries = (groceries / response) * 100;
        double percentTransport = (transportation / response) * 100;
        double percentEntertainment = (entertainment / response) * 100;
        //Budget Summary
        System.out.printf("\nYou Spent %.2f%% on rent\nYou Spent %.2f%% on groceries ", percentRent, percentGroceries);
        System.out.printf("\nYou Spent %.2f%% on Transportation\nYou Spent %.2f%% on Entertainment ", percentTransport, percentEntertainment);
        scanner.close(); //good practice
    }
}