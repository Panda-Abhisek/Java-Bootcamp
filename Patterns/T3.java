import java.util.Scanner;

class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int n = sc.nextInt();

        int m = convToBin(n);
        System.out.println("Binary: " + m);
        sc.close();
    }

    static int convToBin(int n) {
        int i = 1, res = 0;
        while (n>0) {
            int rem = n%2;
            res = res * i + rem;
            n/=2;
            i*=10;
        }
        return (res);
    }
}