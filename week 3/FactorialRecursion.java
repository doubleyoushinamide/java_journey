import java.util.Scanner;

public class FactorialRecursion {
    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (;;) {

            System.out.println("Input a number from (1-30)");
            int number = scanner.nextInt();
            scanner.nextLine();
            int nowNumber = factorial(number);

            System.out.println("The factorial of " + number + " = " + nowNumber);
            System.out.println("Dp you wish to continue? (Yes or No?)");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for playing our recursive game!");
                break;
            }
        } scanner.close();
    }
}
