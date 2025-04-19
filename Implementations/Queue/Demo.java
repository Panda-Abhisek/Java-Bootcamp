package Queue;

public class Demo {
    public static void main(String[] args) {
        QueueUsingLinkedListImpl q = new QueueUsingLinkedListImpl();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Size: " + q.size());      // Output: 4
        System.out.println("Peek: " + q.peek());      // Output: 10
        System.out.println("Poll: " + q.poll());      // Output: 10
        System.out.println("Peek after poll: " + q.peek()); // Output: 20
        System.out.println("Size after poll: " + q.size()); // Output: 3
        System.out.println("Is Empty: " + q.isEmpty());     // Output: false
    }
}
