public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int combination(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
