import java.util.Arrays;

public class MergingTwoSortedArrays {
    // Merging Two Sorted Arrays
    public static void main(String[] args) {
        int[] a = {4,5,6,7,8,9};
        int[] b = {1,2,3,10};

        int[] c = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if(a[i] < b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
        
        System.out.println(Arrays.toString(c));
    }
}
