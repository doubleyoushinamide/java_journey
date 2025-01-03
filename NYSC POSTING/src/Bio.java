import com.sun.jdi.InvalidTypeException;
import java.util.Scanner;

public class Bio {
    private final String candidateName;
    private final int age;
    private final String stateOfOrigin;
    public Bio() throws InvalidTypeException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your name? (e.g., SURNAME + FIRST NAME + MIDDLE NAME): ");
            this.candidateName = scanner.nextLine();
        } catch (Exception e) {
            throw new InvalidTypeException("Do not include numbers.");
        }
        try {
            System.out.println();
            System.out.print("Enter your age: ");
            this.age = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            throw new InvalidTypeException("Enter a valid age");
        }
        try {
            System.out.println();
            System.out.print("Enter your State of Origin?: ");
            this.stateOfOrigin = scanner.nextLine();
        } catch (Exception e) {
            throw new InvalidTypeException("Do not include numbers.");
        }

    }

    public int getAge() {
        return age;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }
}

