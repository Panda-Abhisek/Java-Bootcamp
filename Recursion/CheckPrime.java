class CheckPrime {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int a) {
        if (a <= 1)
            return false;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}