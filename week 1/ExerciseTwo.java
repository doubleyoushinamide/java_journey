import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] arg) {
        //Scanner object
        Scanner scanner = new Scanner(System.in);

        //monthly income
        System.out.println("Enter your monthly income:");
        double monthlyIncome = scanner.nextDouble();

        //number of expenses
        System.out.println("Enter the number of expenses:");
        int numberOfExpenses = scanner.nextInt();
        double totalExpense = 0.0;
/*
        //loop over entering expenses
        int i = 1; //for while loops
        while (i <= numberOfExpenses;) {
            System.out.println("Enter expense " + i + ":");
            double expenseLoop = scanner.nextDouble();
            totalExpense += expenseLoop;
            i++;
        }
*/
        //loop over entering expenses
        //int i = 1; //for while loops
        for (int i = 1; i <= numberOfExpenses; i++) {
            System.out.println("Enter expense " + i + ":");
            double expenseLoop = scanner.nextDouble();
            totalExpense += expenseLoop;
        }

        System.out.printf("\nTotal Income: $%.2f", monthlyIncome);
        System.out.printf("\nTotal Expense: $%.2f", totalExpense);
        double remainingBalance = (monthlyIncome - totalExpense);
        System.out.printf("\nRemaining Balance: $%.2f", remainingBalance);

        scanner.close();
    }
}
