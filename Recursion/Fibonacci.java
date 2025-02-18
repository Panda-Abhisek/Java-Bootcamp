import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many terms Do you want to print in the series: ");
        int N = sc.nextInt();
        System.out.println("Fibonacci Series upto " + N + " terms is : ");
        // for (int i = N-1; i >= 0; i--) {
        //     System.out.print(fib(i)+" ");
        // }
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i)+" ");
        }
        sc.close();  
    }
    public static int fib(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}