class D {
    public static void main(String[] args) {
        //5. Decimal - Binary
        int num = 18; //9, 4, 2, 1
        int bin = 0; //0,10,10,10,20
        int i = 1;

        while (num > 0) {
            int rem = num%2;
            bin = bin+rem*i;   
            num/=2;
            i*=10;
        }
        System.out.println(bin);
    }
}