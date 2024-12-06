import java.util.Scanner;

public class Stringing{
    public static void main(String arg[]) {
    //create a Scanner object
    Scanner scanner = new Scanner(System.in);
    
    //variable declarations
    double principal, rate, time;
    
    //simple interest calculation
    //principal
    System.out.println("______________________________");
    System.out.println("What is the Pricipal?:");
    System.out.println("______________________________");
    principal = scanner.nextDouble();

    //rate
    System.out.println("______________________________");
    System.out.println("What is the Rate?:");
    System.out.println("______________________________");
    rate = scanner.nextDouble();
    
    //time
    System.out.println("______________________________");
    System.out.println("What is the Time given?:");
    System.out.println("______________________________");
    time = scanner.nextDouble();
    
    double simpleInterest = (principal * rate * time) / 100;
    
    //Output the results
    String calculations = String.format("Simple Interest is: %.2f", simpleInterest);
    System.out.println(calculations);
    
    //cloase scanner
    scanner.close();
    }
}
