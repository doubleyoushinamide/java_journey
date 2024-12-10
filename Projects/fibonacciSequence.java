import java.util.Scanner;

public class fibonacciSequence {
    public static void main(String[] args) {
        /*
        * Building fibonacci sequence:
        * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        * */
        //declaration and Initialization of scanner object
        Scanner scanner = new Scanner(System.in);
        //declaring variables of important terms
        int firstTerm = 0, secondTerm = 1;
        //display message
        System.out.println("Enter Number of Terms");
        //capture input as input
        int input = scanner.nextInt();
        //handling first two terms
        if (input == 1) {
            System.out.print(firstTerm);
        } else {
            System.out.print(firstTerm + " " + secondTerm);
        }

        for (int i = 3; i <= input ; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        scanner.close(); //best practices
    }
}
