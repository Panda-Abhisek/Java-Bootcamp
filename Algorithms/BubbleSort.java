public class BubbleSort {
    public static void sort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // Bubble sort
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
