import java.util.Scanner;

public class NewTree {
    public static void main(String[] args) {
        //create a scanner class
        Scanner scanner = new Scanner(System.in);
        //Input prompt
        System.out.println("Kindly Input Your levels of pyramid");
        int levels = scanner.nextInt();

        for (int i = 1; i <= levels; i++) { //handle input levels goes from low to high
            for (int j = levels - i; j > 0; j--) //handles spaces goes from high to low
                System.out.print(" ");
            for (int k = 0; k < (2 * i - 1); k++) //handles stars: goes from low to high
                System.out.print("*");
            System.out.println();
        }
        //close scanner object
        scanner.close();
    }
}