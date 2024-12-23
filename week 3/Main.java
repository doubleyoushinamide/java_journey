import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String firstName;
    String lastName;
    String fullName;
    double firstCA;
    double secondCA;
    double examination;
    double totalScore;

    public Student(String firstName, String lastName, double firstCA, double secondCA, double examination) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.firstCA = firstCA;
        this.secondCA = secondCA;
        this.examination = examination;
        this.totalScore = calculateTotalScore();
    }

    private double calculateTotalScore() {
        return firstCA * 0.15 + secondCA * 0.15 + examination * 0.7;
    }

    @Override
    public String toString() {
        return "Name: " + fullName +
                "\nFirst CA: " + firstCA +
                "\nSecond CA: " + secondCA +
                "\nExamination: " + examination +
                "\nTotal Score: " + totalScore + "\n";
    }
}

class InputValidator {
    public static void validateScores(double firstCA, double secondCA, double examination) throws IllegalArgumentException {
        if (firstCA < 0 || firstCA > 15 || secondCA < 0 || secondCA > 15 || examination < 0 || examination > 100) {
            throw new IllegalArgumentException("First CA Scores must be between 0 and 15 while Exam should not be greater than 100.");
        }
    }

    public static void checkDuplicateName(String fullName, ArrayList<Student> studentList) throws IllegalArgumentException {
        for (Student student : studentList) {
            if (student.fullName.equalsIgnoreCase(fullName)) {
                throw new IllegalArgumentException("Duplicate name found: " + fullName);
            }
        }
    }
}

class StudentDatabase {
    private final ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(String firstName, String lastName, double firstCA, double secondCA, double examination) {
        String fullName = firstName + " " + lastName;
        try {
            InputValidator.validateScores(firstCA, secondCA, examination);
            InputValidator.checkDuplicateName(fullName, studentList);

            Student student = new Student(firstName, lastName, firstCA, secondCA, examination);
            studentList.add(student);
            System.out.println("Student added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the database.");
        } else {
            System.out.println("Student Records:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Database Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter First CA Score (0-15): ");
                    double firstCA = scanner.nextDouble();
                    System.out.print("Enter Second CA Score (0-15): ");
                    double secondCA = scanner.nextDouble();
                    System.out.print("Enter Examination Score (0-100): ");
                    double examination = scanner.nextDouble();

                    database.addStudent(firstName, lastName, firstCA, secondCA, examination);
                    break;

                case 2:
                    database.displayStudents();
                    break;

                case 3:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}