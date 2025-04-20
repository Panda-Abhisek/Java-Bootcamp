package Stack;

public class Demo {
    public static void main(String[] args) {
        // StackUsingArrayList s = new StackUsingArrayList();
        StackUsingLinkedList s = new StackUsingLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("Size: " + s.size()); //Size: 5
        System.out.println("Peek: " + s.peek()); //Peek: 50
        System.out.println("Pop: " + s.pop()); //Pop: 50
        System.out.println("Size after Pop: " + s.size()); //Size after Pop: 4
        System.out.println("Peek after Pop: " + s.peek()); //Peek after Pop: 40
        System.out.println("isEmpty: " + s.isEmpty()); // isEmpty: false
    }
}
