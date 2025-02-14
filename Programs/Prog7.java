class F {
    public static void main(String[] args) {
        //7. Odd & Even Sum Separately
        int num = 755246;
        int evenSum = 0, oddSum = 0;

        while (num > 0) {
            if ((num%10)%2==0) {
                evenSum += num%10;
            } else {
                oddSum += num%10;
            }
            num/=10;
        }
        System.out.println("Even Sum is " + evenSum);
        System.out.println("Odd Sum is " + oddSum);
    }
}