import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

    private static class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;

        }
    }

    //addLast
    public void addLast(int item){
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }
    //addFirst
    public void addFirst(int item){
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        first.next = node;
        first = node;
    }
    //deleteFirst
    public void deleteFirst(){
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last){
            first = last = null;
            return;
        }
        //[10 -> 20 -> 30]
        var second = first.next;
        first.next = null;
        first = second;
    }
    //deleteLast
    public void deleteLast(){
        //[10 -> 20 -> 30]
        var previous = previous(last);
        last = previous;
        last.next = null;

    }
    private Node previous(Node node){
        var current = first;
        while (current != null){
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }
    //contains
    //indexOf
    private boolean isEmpty(){
        return first == null;
    }
}
