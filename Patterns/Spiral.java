public class Spiral {
    public static void main(String[] args) {
        int n = 5;
        int value = 1;
        int[][] spiral = new int[n][n];
        int t = 0, b = n-1;
        int l = 0, r = n-1;

        while (value <= n*n) {
            //top row
            for (int i = l; i <= r; i++) {
                spiral[t][i] = value++;
            }
            t++;

            //right column
            for (int i = t; i <= b; i++) {
                spiral[i][r] = value++;
            }
            r--;

            //bottom row
            for (int i = r; i >= l; i--) {
                spiral[b][i] = value++;
            }
            b--;

            //left column
            for (int i = b; i >= t; i--) {
                spiral[i][l] = value++;
            }
            l++;
        }

        System.out.println("Spiral Pattern - " + n);

        for (int[] row : spiral) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}