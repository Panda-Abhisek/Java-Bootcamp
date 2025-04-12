public class SecondSmallestEle {
    //Second Smallest Element Finding
    public static int secondSmallest(int[] a) {
        int smallest = a[0], secondSmallest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            } else if (a[i] < secondSmallest || smallest == secondSmallest) {
                secondSmallest = a[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        int[] a = {6,5,1,3,8,7,0,4,9};
        System.out.println(secondSmallest(a));
    }
}
