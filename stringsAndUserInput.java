//importing the Scanner class
import java.util.Scanner;

//main class
public class MyClass {
    // the main method with static contents and returns no value
    public static void main(String args[]) {
        //create the scanner object
        Scanner scanner = new Scanner(System.in); //the new allocates memory
        
        System.out.println("Welcome to Calorie Counter Pro!");
        
        // First food Item
        System.out.println("Enter the name of the first food item:");
        String firstFood = scanner.nextLine(); //input = Rice
        
        System.out.println("Enter the calorie for " + firstFood + ":");
        int riceCalorie = scanner.nextInt();
        scanner.nextLine();
        
        // Second Food Item
        System.out.println("Enter the name of the second food item:");
        String secondFood = scanner.nextLine(); //input = Salad
        
        System.out.println("Enter the calorie for " + secondFood + ":");
        int saladCalorie = scanner.nextInt();
        scanner.nextLine();
        
        // Third Food Item
        System.out.println("Enter the name of the third food item:");
        String thirdFood = scanner.nextLine(); //input = Chicken Breast
        
        System.out.println("Enter the calorie for " + thirdFood + ":");
        int cbCalorie = scanner.nextInt();
        scanner.nextLine();
        
        //Calorie Intake Calculation
        System.out.println("-----------------------------");
        System.out.println("Your Calorie Intake:");
        System.out.println("-----------------------------");
        
        System.out.println("1. " + firstFood + " - " + riceCalorie + " calorie");
        System.out.println("2. " + secondFood + " - " + saladCalorie + " calorie");
        System.out.println("3. " + thirdFood + " - " + cbCalorie + " calorie");
        
        //Calculating total calorie intake
        int sumCalories = riceCalorie + saladCalorie + cbCalorie;
        System.out.println("\nTotal Calorie Intake: " + sumCalories);
        System.out.println("Thank you for using Calorie Counter Pro!");
        
        
        scanner.close(); //closes the scanner object created
    }
}
