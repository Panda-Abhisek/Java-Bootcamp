import java.util.Scanner;

class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int stars = 1;
        int spaces = 1;

        for (int i = 1; i <= n; i++) {
            // for printing spaces
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            // for printing stars
            if (i == 1 || i == n) {
                for (int j = 1; j <= stars; j++) {
                    System.out.print("x");
                }
            } else {
                System.out.print("x");
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("x");
                spaces += 2;
            }
            stars += 2;

            System.out.println();
        }

        sc.close();
    }
}