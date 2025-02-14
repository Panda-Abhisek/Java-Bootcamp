class P3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
                if (j > i)
                    System.out.print("x");
            }
            System.out.println();
        }
    }
}
