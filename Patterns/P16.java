import java.util.Scanner;

class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = i; j <= n-1; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

        sc.close();
    }
}