public class BSUsingRec {
    static int[] arr;
    static int ele;
    public static void search(int[] a, int e) {
        arr = a;
        ele = e;
        search(0, arr.length-1);
    }
    public static void search(int start, int end) {
        if(start > end) return ;
        int mid = (start + end)/2;
        if(arr[mid] == ele) System.out.println(ele + " present at " + mid);
        else if(ele < arr[mid]) search(start, mid-1);
        else search(mid+1, end);
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6, 8, 54, 56, 65, 74, 75};
        search(a, 6);
    }
}
