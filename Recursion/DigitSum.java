class DigitSum {
    public static void main(String[] args) {
        int n = 63429;
        System.out.println(sum(n));
    }

    public static int sum(int a) {
        if (a <= 9)
            return a;
        return a % 10 + sum(a / 10);
    }
}