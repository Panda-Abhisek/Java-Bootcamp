public class Demo {
    public static void main(String[] args) {
        ArrayListImpl al = new ArrayListImpl();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);

        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }
}
