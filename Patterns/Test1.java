import java.util.Scanner;

class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        while (a<n) {
            System.out.print(a);
            c = a+b;
            a = b;
            b = c;
        }
        sc.close();
    }
}