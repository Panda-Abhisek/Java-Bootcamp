class A{
    public static void main(String[] args) {
        // S U M  O F  D I G I T S
        int num = 3455;
        int sum = 0;

        while (num > 0) {
            sum += num%10;
            num /= 10;
        }
        System.out.println("Sum of Digits is " + sum);
    }
}