import java.util.NoSuchElementException;

public class Queue {
    private Node start;
    private Node end;

    private static class Node{
        private Node next;
        private final String value;
        public Node(String value){
            this.value = value;
        }
    }

    public void add(String item){
        Node node = new Node(item);
        if (isEmpty()){
            start = end = node;
            return;
        }
        end.next = node;
        end = node;
    }
    public void remove(){
        if (isEmpty()){
            throw new NoSuchElementException("There's no item in the queue");
        }
        start = start.next;
    }
    public String peek(){
        if (isEmpty()){
            return null;
        }
        return start.value;
    }
    private boolean isEmpty(){
        return start == null;
    }

    public void print(){
        Node current = start;
        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
