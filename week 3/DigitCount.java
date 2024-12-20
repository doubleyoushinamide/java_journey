import java.util.*;

public class DigitCount {
    public static int counter(int input) {
        String newlyConvertedInt = Integer.toString(input);
        return newlyConvertedInt.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNumber = scanner.nextInt();
        System.out.println("You have " + counter(inputNumber) + " digits in your number");
    }
}
