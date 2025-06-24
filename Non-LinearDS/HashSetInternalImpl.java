public class HashSetInternalImpl {
    static class Node {
        int key;
        Node next;
        Node(int key, Node next) {
            this.key = key;
            this.next = next;
        }
    }

    private int count = 0;
    Node[] a = new Node[10];
    boolean flag = true;

    //size()
    public int size() {
        return count;
    }

    // isEmpty()
    public boolean isEmpty() {
        return count == 0;
    }

    // add
    public boolean add(Integer key) {
        int bi = key.hashCode();
        int di = Math.abs(bi%a.length);

        if (a[di] == null) {
            a[di] = new Node(key, null);
            count++;
            return flag;
        }
        Node curr = a[di];
        Node temp = null;
        while (curr != null) {
            if (key.equals(curr.key)) {
                return false;
            }
            temp = curr;
            curr = curr.next;
        }
        temp.next = new Node(di, null);
        count++;
        return false;
    }

    public void dispaly() {
        for (int i = 0; i < a.length; i++) {
            Node curr = a[i];
            while (curr != null) {
                System.out.print(curr.key + " ");
                curr = curr.next;
            }
        }
    }

    public boolean contains(Integer key) {
        int bi = key.hashCode();
        int di = Math.abs(bi%a.length);
        Node curr = a[di];
        while (curr != null) {
            if (key.equals(curr.key)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public boolean remove(Integer key) {
        int bi = key.hashCode();
        int di = Math.abs(bi%a.length);
        Node curr = a[di];
        Node prev = null;

        while (curr != null) {
            if (key.equals(curr.key)) {
                if (prev == null) {
                    a[di] = a[di].next;
                    count--; return flag;
                }
                prev.next = prev.next.next;
                count--; return flag;
            }   
        }
        return false;
    }

    public static void main(String[] args) {
        HashSetInternalImpl set = new HashSetInternalImpl();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(4);

        set.dispaly();
        System.out.println(set.contains(4));
        System.out.println(set.remove(4));
        set.dispaly();
    }
}
