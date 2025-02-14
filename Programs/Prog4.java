class C {
    public static void main(String[] args) {
        //4. Binary - Decimal
        int num = 10010;
        int i = 1;
        int dec = 0;
        while (num > 0) {
            int bit = num % 10;
            dec += bit*i;
            num/=10;
            i*=2;
        }
        System.out.println(dec);
    }
}