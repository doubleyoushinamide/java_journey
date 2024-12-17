import java.util.Scanner;

/* Write a program that does the following:
 * 1. Prompt user for an input
 * 2. If input is divisible by 3, output = "fizz"
 * 3. If input is divisible by 5, output = "buzz"
 * 4. If input is divisible by both 3 and 5, output = "fizzbuzz"
 * 5. If input is neither divisible by 3 nor 5, output same number.
 * */
public class FizzBuzz {
    public static void main(String[] args) {
        //create a scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kindly Enter a Number: ");
        byte number = scanner.nextByte();

        // There is a reason why ((number % 3 == 0) && (number % 5 == 0)) needed to come
        //first. because, if it doesn't, one of the conditions of number%3 or number%5
        // would have been true before  ((number % 3 == 0) && (number % 5 == 0)) is
        // implemented which will always assume to be false

        if ((number % 3 == 0) && (number % 5 == 0)) {
            System.out.println("fizzbuzz");
        } else if (number % 3 == 0)
            System.out.println("fizz");
        else if (number % 5 == 0)
            System.out.println("buzz");
        else System.out.println(number);
    }
}
