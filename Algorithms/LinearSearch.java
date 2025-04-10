public class LinearSearch {
    public static void search(int[] a, int e) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == e) {
                System.out.println(e + " is present at index " + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 4, 54, 75, 2, 5, 74, 8, 1, 6, 56, 65 };
        search(a, 1);
    }
}
