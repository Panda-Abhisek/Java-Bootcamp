public class BinarySearch {
    public static void search(int[] a, int e) {
        int i = 0, j = a.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a[mid] == e){
                System.out.println(e + " is at index " + mid);
                break;
            }
            else if (e < a[mid])
                j = mid - 1;
            else
                i = mid + 1;
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5, 6, 8, 54, 56, 65, 74, 75 };
        search(a, 6);
    }
}
