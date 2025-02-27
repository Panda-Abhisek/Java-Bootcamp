class CheckPrime {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(isPrime(n, 2));
    }

    public static boolean isPrime(int a, int i) {
        if (a <= 1) {
            return false;
        }
        if (i > Math.sqrt(a)) {
            return true;
        }
        if (a % i == 0) {
            return false;
        }
        return isPrime(a, i + 1);
    }
}
