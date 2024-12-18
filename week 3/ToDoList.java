// Import necessary Java packages
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    // Declare a global ArrayList to store the TODO list
    private final ArrayList<String> todoList = new ArrayList<>();

    public void manageTodoList() {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the TODO List Application!");

        // Menu loop
        do {
            displayMenu(); // Display the menu options
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Handle the menu choice
            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    removeTask(scanner);
                    break;
                case 3:
                    displayTasks();
                    break;
                case 4:
                    System.out.println("Exiting the TODO List Application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 4);
    }

    // Method to display the menu
    private void displayMenu() {
        System.out.println("\nTODO List Menu:");
        System.out.println("1. Add a task");
        System.out.println("2. Remove a task");
        System.out.println("3. Display tasks");
        System.out.println("4. Exit");
    }

    // Method to add a task to the TODO list
    private void addTask(Scanner scanner) {
        System.out.println("Enter the task to add:");
        String task = scanner.nextLine();
        todoList.add(task);
        System.out.println("Task added successfully!");
    }

    // Method to remove a task from the TODO list
    private void removeTask(Scanner scanner) {
        if (todoList.isEmpty()) {
            System.out.println("The TODO list is empty. Nothing to remove.");
            return;
        }

        displayTasks(); // Display the current tasks
        System.out.println("Enter the task number to remove:");
        int taskNumber = scanner.nextInt();

        if (taskNumber > 0 && taskNumber <= todoList.size()) {
            todoList.remove(taskNumber - 1); // Remove the task
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid task number. Please try again.");
        }
    }

    // Method to display all tasks in the TODO list
    private void displayTasks() {
        if (todoList.isEmpty()) {
            System.out.println("The TODO list is currently empty.");
            return;
        }

        System.out.println("\nTODO List:");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ". " + todoList.get(i));
        }
    }
}
