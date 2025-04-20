package Stack;

import java.util.EmptyStackException;

public class StackUsingLinkedList {

    private Node first = null;
    private int count = 0;

    private static class Node {
        Object ele;
        Node next;
    
        Node(Object ele, Node next) {
            this.ele = ele;
            this.next = next;
        }
    }
    
    public void push(Object e) {
        first = new Node(e, first);
        count++;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Object ele = first.ele;
        first = first.next;
        count--;
        return ele;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return first.ele;
    }

    public boolean isEmpty() {
        return count==0;
    }

    public int size() {
        return count;
    }
}
