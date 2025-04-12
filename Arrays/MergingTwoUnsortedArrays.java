import java.util.Arrays;

public class MergingTwoUnsortedArrays {
    // Merging Two Unsorted Arrays
    public static void main(String[] args) {
        int[] a = { 6, 5, 1, 3 };
        int[] b = { 8, 7, 0, 4, 9 };

        int[] c = new int[a.length + b.length];

        int i = 0;
        while (i < a.length) {
            int j = i - 1, key = a[i];
            while (j >= 0 && c[j] > key) {
                c[j + 1] = c[j--];
            }
            c[j + 1] = key;
            i++;
        }

        i = 0;
        while (i < b.length) {
            int j = a.length-1+i, key = b[i];
            while (j >= 0 && c[j] > key) {
                c[j + 1] = c[j--];
            }
            c[j + 1] = key;
            i++;
        }

        System.out.println(Arrays.toString(c));
    }
}
