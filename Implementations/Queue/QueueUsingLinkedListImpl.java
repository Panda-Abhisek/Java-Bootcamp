package Queue;

public class QueueUsingLinkedListImpl {
    // 1. add(), 2. poll(), 3. peek(), size(), isEmpty().
    private Node first = null;
    private Node last = null;
    private int count = 0;

    private static class Node {
        Object ele;
        Node next;
    
        Node(Object ele, Node next) {
            this.ele = ele;
            this.next = next;
        }
    }

    public void add(Object e) {
        if (first == null) {
            first = new Node(e, null);
            last = first;
            count++;
            return;
        }
        last.next = new Node(e, null);
        last = last.next;
        count++;
    }

    public Object poll() {
        if(first == null) return null;
        Object ele = first.ele;
        first = first.next;
        if(first == null) last = null;
        count--;
        return ele;
    }

    public Object peek() {
        if (first == null) {
            return null;
        }
        return first.ele;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}
