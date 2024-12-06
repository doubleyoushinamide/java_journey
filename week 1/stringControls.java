import java.util.Scanner;

public class Stringing{
    public static void main(String arg[]) {
    Scanner scanner = new Scanner(System.in);
    /*
    System.out.println("Kindly enter your desired text:");
    String texts = scanner.nextLine();
    
    System.out.println("Entry in upperCase: " + texts.toUpperCase());
    System.out.println("Entry in lowerCase: " + texts.toLowerCase());
    */
    //string formatting
    System.out.println("What is your name, please?");
    String nameBuyer = scanner.nextLine();
    
    System.out.println("__________________________________");
    String greetings = String.format("Welcome to the hood, %s!", nameBuyer);
    System.out.println(greetings);
    System.out.println("__________________________________");
    
    //ask for the price of the goods
    System.out.println("How much are you holding in $?");
    double holdingAmount = scanner.nextDouble();
    if (holdingAmount <= 1000) {
        String holdAmount2 = String.format("You have $%.2f. \nSorry insufficient Funds!", holdingAmount);
        System.out.println(holdAmount2);
    }
    else {
        double changeAtHand = holdingAmount - 1000;
        String readyMessage = String.format("Your order is ready! \nYour change is $%.2f ", changeAtHand);
        System.out.println(readyMessage);
    }
    scanner.close();
    }
}
