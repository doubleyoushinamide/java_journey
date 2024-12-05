// Importing the necessary Java package for handling user input
import java.util.Scanner;
 
public class Exercise {
    public void tradeProfitCalculator() {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
 
        // Prompt the user to enter the cost price and selling price
        System.out.println("Enter the cost price of the item:");
        double costPrice = scanner.nextDouble();
 
        System.out.println("Enter the selling price of the item:");
        double sellingPrice = scanner.nextDouble();
 
        // Calculate the profit or loss
        double profit = sellingPrice - costPrice;
 
        // Display the result with relational operators
        if (profit > 0) {
            System.out.println("Profit: " + profit);
        } else if (profit < 0) {
            System.out.println("Loss: " + (-profit));
        } else {
            System.out.println("No profit, no loss.");
        }
 
        // Demonstrate unary operators
        System.out.println("\nDemonstrating Unary Operators:");
        int unitsSold = 10;
        System.out.println("Initial units sold: " + unitsSold);
        System.out.println("Units sold after increment: " + (++unitsSold));
        System.out.println("Units sold after decrement: " + (--unitsSold));
 
        // Demonstrate compound operators
        System.out.println("\nDemonstrating Compound Operators:");
        double totalRevenue = 0;
        totalRevenue += sellingPrice * unitsSold; // Compound addition operator
        System.out.println("Total revenue after selling " + unitsSold + " units: $" + totalRevenue);
 
        // Use the modulo operator
        System.out.println("\nDemonstrating Modulo Operator:");
        int remainder = unitsSold % 3;
        System.out.println("Remainder when units sold is divided by 3: " + remainder);
    }
}
