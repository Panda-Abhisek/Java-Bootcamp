public class QuickSort {
    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void sort(int[] a, int start, int end) {
        if (start >= end)
            return;

        int i = start, j = end, pivot = a[(start + end) / 2];

        while (i <= j) {
            while (a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;

            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++; j--;
            }
        }

        sort(a, start, j);
        sort(a, i, end);
    }

    public static void main(String[] args) {
        // Quick sort
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
