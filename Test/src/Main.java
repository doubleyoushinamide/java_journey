public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        //........ADDITION METHOD.........
        numbers.insert(7);
        numbers.insert(2);
        numbers.insert(1);
        numbers.insert(4);
        numbers.insert(10);
        //...............
        System.out.printf("Number of counts: %d", numbers.count);
        System.out.println();
        numbers.print();
        System.out.println();

        //............FIND METHOD.........
        System.out.println("The number 10 is at: " + numbers.findIndex(10));
        System.out.println("The number 1 is at: " + numbers.findIndex(1));

        //.............REMOVAL METHOD.......
        numbers.removeAt(1);
        numbers.removeAt(0);
        System.out.printf("Number of counts: %d", numbers.count);
        System.out.println();
        numbers.print();

        //............FIND METHOD.........
        System.out.println("The number 10 is at: " + numbers.findIndex(10));
    }
}