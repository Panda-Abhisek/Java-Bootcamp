public class InsertionSort {
    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int key = a[i], j = i-1;
            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j--];
            }
            a[j+1] = key;
        }
    }
    public static void main(String[] args) {
        // Insertion sort
        int[] arr = { 3, 5, 2, 8, 1, 6 };

        System.out.print("Before Sorting - ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sort(arr);

        System.out.print("\n\nAfter Sorting - ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
