import java.util.Scanner;

public class J1a extends JSS1 {
    public J1a(String name){
        //properties of Jss1 students
        //they are lousy
        //they are stubborn
        //they are dirty
        //they are funny
        caller(name);
    }
    private void caller(String name){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly choose your operation:");
        System.out.println("1. A lousy student:");
        System.out.println("2. A stubborn student:");
        System.out.println("3. A dirty student:");
        System.out.println("4. A funny student:");
        int operation = scanner.nextInt();
        switch (operation){
            case 1:
                lousy(name);
                break;
            case 2:
                stubborn(name);
                break;
            case 3:
                dirty(name);
                break;
            case 4:
                funny(name);
                break;
            default:
                System.out.println("Pick a valid operation.");
        }

    }
}
