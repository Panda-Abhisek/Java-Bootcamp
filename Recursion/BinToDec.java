class BinToDec {
    public static void main(String[] args) {
        int a = 1100;
        System.out.println(binToDec(a, 1));
    }
    //Recursion
    public static int binToDec(int n, int power) {
        if(n==0) return 0;
        return (n%10)*power + binToDec(n/10, power*2);
    }
    // USING METHODS
    /*
    public static int binToDec(int n) {
        int dec = 0;
        int i = 1;
        while (n>0) {
            dec += (n%10) * i;
            n/=10;
            i*=2;
        }
        return dec;
    }
    */
}
