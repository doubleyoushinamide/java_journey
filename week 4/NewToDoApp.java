import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewToDoApp {
    private static final ArrayList<String> createdList = new ArrayList<>();
    public static final ArrayList<Boolean> isCompleted = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creating a scanner instance
        while (true){
            //2. Display the menu for user for every iteration
            try {
                System.out.println("1. Add a task");
                System.out.println("2. View all tasks");
                System.out.println("3. Mark a task as completed");
                System.out.println("4. Remove a task");
                System.out.println("5. Exit the application");
                System.out.print("6. Enter your choice: ");
                //3. what the menu should perform
                int response = scanner.nextInt();
                scanner.nextLine(); //consumes next line
                switch (response) {
                    case 1:
                        addTask(scanner);
                        break;
                    case 2:
                        viewAllTasks(scanner);
                        break;
                    case 3:
                        markAsCompleted(scanner);
                        break;
                    case 4:
                        removeTask(scanner);
                    case 5:
                        exitApp(scanner);
                        break;
                    default:
                        System.out.println("Invalid Selection! (select between options 1-5)");
                }
            } catch (Exception e) {
                //throw new RuntimeException(e);
                System.out.println("Invalid input");
            }

        }

    }
    private static void addTask(Scanner scanner) {
        System.out.print("Enter task: ");
        String response = scanner.nextLine();
        createdList.add(response);
        isCompleted.add(false);
        System.out.println("-------------------------");
        System.out.println("\t\tTask Added!");
        System.out.println("-------------------------");
    }

    public static void viewAllTasks(Scanner scanner){
        if (createdList.isEmpty()){
            System.out.println("-------------------------");
            System.out.println("Task list is still EMPTY");
            System.out.println("-------------------------");
        } else {
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
            for (int i = 0; i < createdList.size(); i++) {
                String check = isCompleted.get(i) ? "Completed!" : "Incomplete!";
                System.out.println((i+1) + "." + createdList.get(i) + "  " + "[" + check + "]");
            }
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
        }
    }
    public static void markAsCompleted(Scanner scanner){
        System.out.println("Enter the task you've completed");
        int response = scanner.nextInt(); scanner.nextLine();
        if (response > 0 && response <= createdList.size() + 1) {
            isCompleted.set(response-1, true);
        } else {
            System.out.println("-------------------------");
            System.out.println("\t\tInvalid Entry!");
            System.out.println("-------------------------");
        }
    }
    public static void exitApp(Scanner scanner){
        System.out.println("-----------------------------");
        System.out.println("Thank you for using this app");
        System.out.println("-----------------------------");
    }
    public static void removeTask(Scanner scanner){
        System.out.print("Enter task: ");
        int response = scanner.nextInt();
        if (response > 0 && response < createdList.size()) {
            createdList.remove(response - 1);
            isCompleted.remove(response - 1);
            System.out.println("-------------------------");
            System.out.println("\t\tTask Removed!");
            System.out.println("-------------------------");
        } else {
            System.out.println("-------------------------");
            System.out.println("\t\tInvalid Input!");
            System.out.println("-------------------------");
        }
    }
}
