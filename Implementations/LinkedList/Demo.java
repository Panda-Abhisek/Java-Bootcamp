public class Demo {
    public static void main(String[] args) {
        LinkedListImpl l = new LinkedListImpl();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }

        l.reverse();

        System.out.println("\nAfter Reverse: ");
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }
}
