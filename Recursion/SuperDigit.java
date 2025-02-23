// LOGIC 1 -: CALCULATE SUM USING WHILE LOOP, THEN PASS THE sum VALUE AS argument TO THE RECURSIVE FUNC.
class SuperDigit {
    public static int sum(int n) {
        if (n <= 9)
            return n;
        int digitSum = 0;
        while (n > 0) {
            digitSum += n % 10;
            n /= 10;
        }
        return sum(digitSum);
    }

    public static void main(String[] args) {
        System.out.println(sum(4897));
    }
}

// LOGIC 2 -: USING TERNARY OPERATOR AND MATHEMATICS
class Super {
    public static int superDig(int n) {
        if(n == 0 || n < 10) return n;
        return n%9==0 ? 9 : n%9;
    }
    public static void main(String[] args) {
        int a = 4897;
        System.out.println(superDig(a));
    }
}