public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("Jacob Smith");
        queue.add("Adam and Eve");
        queue.add("Noah");
        queue.add("Shadrach");
        queue.add("Joseph");
        queue.add("Paul");

        queue.print();
        System.out.println();

        //removal
        queue.remove();
        queue.remove();

        queue.print();

        System.out.println();

        //peek
        System.out.println("First item: " + queue.peek());
    }
}