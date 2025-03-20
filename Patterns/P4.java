import java.util.Scanner;

class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print(j);
                if (j>i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}