import java.util.Scanner;

class R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int spaces = 0;
        int stars = n*2-1;

        for (int i = 1; i <= n; i++) {
            //for spaces printing
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //for printing stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("x");
            }

            System.out.println();
            spaces++;
            stars -= 2;
        }

        sc.close();
    }
}