import java.util.Scanner;

public class Workspace {
    /*
    * Create an email validator.
    * The validator checks if the email as '@'
    * and if the '.' is after the '@'.
    * Optional:
    * checks that '@' is not starting the email and does not end the email
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly Enter your email address: ");
        String input = scanner.nextLine();
        boolean isTrue = isEmailValid(input);
        if (isTrue)
            System.out.println("Valid Email!");
        else
            System.out.println("Invalid Email!");
    }

    public static boolean isEmailValid(String email) {
        if (!email.contains("@"))
            return false;
        int indexOf = email.indexOf("@");
        String cutAtIndex = email.substring(indexOf + 1);
        if (!cutAtIndex.contains("."))
            return false;
        //not necessary! some emails has '.' before the '@'.
        String cutTillAt = email.substring(0, indexOf); //cut from the beginning of the email up on till '@'
        if (cutTillAt.contains("."))
            return false;
        return true;
    }
}
