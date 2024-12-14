import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    public static void main(String[] args) {
        // Create an ArrayList to store tasks
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) { //infinite loop until manually broken
            // Display menu options
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Remove a task");
            System.out.println("4. Clear all tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice --->: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add a task
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break; //break out of the switch case not out of the loop

                case 2:
                    // View all tasks
                    System.out.println("\nYour Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break; //break out of the switch case not out of the loop

                case 3:
                    // Remove a task
                    System.out.println("\nYour Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i)); //number = index + 1
                        }
                        System.out.print("Enter the task number to remove: ");
                        int taskNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
                            tasks.remove(taskNumber - 1); //index = number - 1
                            System.out.println("Task removed!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break; //break out of the switch case not out of the loop

                case 4:
                    // Clear all tasks
                    tasks.clear();
                    System.out.println("All tasks cleared!");
                    break; //break out of the switch case not out of the loop

                case 5:
                    // Exit the program
                    System.out.println("Exiting Task Manager. Goodbye!");
                    scanner.close();
                    return; //gets out of both switch case and loop

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
