public class PatternPrinter {
    public static void main(String[] args) {
        int n = 5; // Size of the pattern
        int count = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                // Print numbers in increasing order for odd rows
                for (int j = 0; j < n; j++) {
                    System.out.print(count + "\t");
                    count++;
                }
            } else {
                // Print numbers in decreasing order for even rows
                count += n - 1;
                for (int j = 0; j < n; j++) {
                    System.out.print(count + "\t");
                    count--;
                }
                count += n + 1;
            }
            System.out.println();
        }
    }
}