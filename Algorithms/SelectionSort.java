public class SelectionSort {
    public static void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
    public static void main(String[] args) {
        // Selection sort
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
