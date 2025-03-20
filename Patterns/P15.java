import java.util.Scanner;

class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int stars = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("x");
            }
            System.out.println();
            stars+=2;
        }
        stars-=4;
        int spaces = 1;
        for (int i = n-1; i >= 1; i--) {
            //for spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("x");
            }
            System.out.println();
            spaces++;
            stars-=2;
        }

        sc.close();
    }
}