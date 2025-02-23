class DecToBin {
    public static void main(String[] args) {
        int a = 12;
        System.out.println(decToBin(a));
    }    
    public static int decToBin(int n) {
        if(n==0) return 0;
        return n%2 + 10*decToBin(n/2);
    }
}
