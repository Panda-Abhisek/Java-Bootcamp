public class SmallestEle {
    //Smallest Element in an Array
    public static int smallest(int[] a) {
        int small=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < small) {
                small = a[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int[] a = {6,5,1,3,8,7,0,4,9};
        System.out.println(smallest(a));
    }
}