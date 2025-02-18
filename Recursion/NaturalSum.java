class NaturalSum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    public static int sum(int a) {
        if (a == 1) {
            return 1;
        }
        return a + sum(a - 1);
    }
}