class maxMin {
    public static void main(String[] args) {
        int A[] = { 1, 45, 3, -45, 90, -8 };
        int n = A.length;
        int min = minFun(A, n);
        int max = maxFun(A, n);
        System.out.println("Minimum and Maximum in Array A : " + min + " , " + max);
    }

    public static int minFun(int[] A, int n) {
        if (n == 1)
            return A[0];
        return Math.min(A[n-1], minFun(A, n-1));
    }
    public static int maxFun(int[] A, int n) {
        if (n == 1)
            return A[0];
        return Math.max(A[n-1], maxFun(A, n-1));
    }
}