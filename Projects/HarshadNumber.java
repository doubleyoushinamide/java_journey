import java.util.Scanner;

public class HarshadNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");

        int input = scanner.nextInt();
        int originalNumber = input; //originalNumber is free from manipulation

        int sumNumbers = 0;

        while (input > 0) {
            sumNumbers += input % 10;
            input /= 10; //decrement
        }
        if (originalNumber % sumNumbers != 0) {
            System.out.printf("\n The number %s is not a Harshard Number", originalNumber);
        } else {
            System.out.printf("\n The number %s is a Harshard Number", originalNumber);
        }
        scanner.close(); //best practice
    }
}