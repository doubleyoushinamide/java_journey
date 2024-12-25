import java.util.ArrayList;
import java.util.Scanner;

public class NewToDoApp {
    private static final ArrayList<String> createdList = new ArrayList<>();
    public static final ArrayList<Boolean> isCompleted = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creating a scanner instance
        outer://label
        while (true){
            //2. Display the menu for user for every iteration
            try {
                System.out.println("\n1. Add a task");
                System.out.println("2. View all tasks");
                System.out.println("3. Mark a task as completed");
                System.out.println("4. Remove a task");
                System.out.println("5. Exit the application");
                System.out.print("(Enter your choice): ===> ");
                //3. what the menu should perform
                if (scanner.hasNextInt()) {
                    int response = scanner.nextInt();
                    scanner.nextLine(); //consumes next line
                    switch (response) {
                        case 1:
                            addTask(scanner);
                            break;
                        case 2:
                            viewAllTasks();
                            break;
                        case 3:
                            markAsCompleted(scanner);
                            break;
                        case 4:
                            removeTask(scanner);
                            break;
                        case 5:
                            exitApp();
                            break outer;
                        default:
                            System.out.println("Invalid Selection! (select between options 1-5)");
                    }
                } else {
                    System.out.println("Invalid Input (select between options 1-5)");
                    break;
                }
            } catch (Exception e) {
                //throw new RuntimeException(e);
                System.out.println("Invalid input");
            }

        }

    }
    private static void addTask(Scanner scanner) throws InterruptedException {
        System.out.print("Enter task: ");
        String response = scanner.nextLine();
        System.out.print("Please wait!");
        for (int i=0; i < 5; i++) {
            System.out.print("==");
            Thread.sleep(1000);
        }
        System.out.print("(100%)");
        createdList.add(response);
        isCompleted.add(false);
        System.out.println("\n-------------------------");
        System.out.println("\t\tTask Added!");
        System.out.println("-------------------------");
    }

    public static void viewAllTasks(){
        if (createdList.isEmpty()){
            System.out.println("-------------------------");
            System.out.println("Task list is still EMPTY");
            System.out.println("-------------------------");
        } else {
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
            for (int i = 0; i < createdList.size(); i++) {
                String check = isCompleted.get(i) ? "Completed!" : "Incomplete!";
                System.out.println((i+1) + ". " + createdList.get(i) + "  " + "[" + check + "]");
            }
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
        }
    }
    public static void markAsCompleted(Scanner scanner) throws InterruptedException {
        System.out.println("Enter the task you've completed");
        int response = scanner.nextInt(); scanner.nextLine();
        System.out.print("Please wait!");
        for (int i=0; i < 5; i++) {
            System.out.print("==");
            Thread.sleep(1000);
        }
        System.out.print("(100%)");
        if (response > 0 && response <= createdList.size() + 1) {
            isCompleted.set(response-1, true);
        } else {
            System.out.println("\n-------------------------");
            System.out.println("\t\tInvalid Entry!");
            System.out.println("-------------------------");
        }
    }
    public static void exitApp(){
        System.out.println("\n-----------------------------");
        System.out.println("Thank you for using this app");
        System.out.println("-----------------------------");
    }
    public static void removeTask(Scanner scanner) throws InterruptedException{
        System.out.print("Enter task: ");
        int response = scanner.nextInt();
        System.out.print("Please wait!");
        for (int i=0; i < 5; i++) {
            System.out.print("==");
            Thread.sleep(1000);
        }
        System.out.print("(100%)");
        if (response > 0 && response <= createdList.size()) {
            createdList.remove(response - 1);
            isCompleted.remove(response - 1);
            System.out.println("\n-------------------------");
            System.out.println("\t\tTask Removed!");
            System.out.println("-------------------------");
        } else {
            System.out.println("\n-------------------------");
            System.out.println("\t\tInvalid Input!");
            System.out.println("-------------------------");
        }
    }
}
