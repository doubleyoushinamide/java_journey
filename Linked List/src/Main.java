public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.print();

        list.addFirst(200);
        list.addLast(40);
        list.addLast(2);
        list.addFirst(1);
        list.print();
        list.deleteFirst();
        list.deleteLast();
        list.print();

    }
}
