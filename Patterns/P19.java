import java.util.Scanner;

class S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // for space printing
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // for number printing
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // for right part number printing
            if (i>1) {
                for (int j = i-1; j >= 1; j--) {
                    System.out.print(j);
                }
            }

            System.out.println();
        }

        sc.close();
    }
}