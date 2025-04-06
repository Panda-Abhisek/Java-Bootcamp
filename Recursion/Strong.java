
// Strong Number printing in range using recursion
import java.util.Scanner;

public class Strong {
    public static int fact(int a) {
        if (a <= 1)
            return 1;
        return (a * fact(a - 1));
    }

    public static int strong(int n) {
        if (n == 0)
            return 0;
        return fact(n % 10) + strong(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Starting Range: ");
        int start = sc.nextInt();
        System.out.println("Enter Ending Range: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            // int number = 145
            if (strong(i) == i) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}