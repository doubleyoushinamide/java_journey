import java.util.Scanner;

public class EmailCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an email address to validate:");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("The email address is valid.");
        } else {
            System.out.println("The email address is invalid.");
        }

        scanner.close();
    }

    /**
     * Validates the email address based on predefined rules.
     *
     * @param email The email address to validate.
     * @return true if the email is valid, false otherwise.
     */
    public static boolean isValidEmail(String email) {
        // Check if there is exactly one '@' symbol
        if (!email.contains("@")) {
            return false;
        }

        // Ensure there are characters before and after the '@' symbol
        int atIndex = email.indexOf('@');
        if (atIndex < 1 || atIndex == email.length() - 1) {
            return false;
        }

        // Verify there is at least one '.' after the '@' symbol
        String domainPart = email.substring(atIndex + 1);
        if (!domainPart.contains(".")) {
            return false;
        }

        // Check that the '.' is not the first or last character after the '@' symbol
        int dotIndex = domainPart.indexOf('.');
        if (dotIndex < 1 || dotIndex == domainPart.length() - 1) {
            return false;
        }

        // Ensure there are no spaces in the email
        if (email.contains(" ")) {
            return false;
        }

        // If all conditions are satisfied, return true
        return true;
    }
}