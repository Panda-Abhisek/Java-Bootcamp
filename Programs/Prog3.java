class B {
    public static void main(String[] args) {
        // 3. Sum of Digits up to single digit
        int num = 3455;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
            if (num == 0 && sum > 9) {
                num = sum;
                sum = 0;
            }
        }
        System.out.println(sum);
    }
}