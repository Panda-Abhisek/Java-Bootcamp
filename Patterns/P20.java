import java.util.Scanner;

class T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int spaces = 1;
        int stars = n/2;

        for (int i = 1; i <= n; i++) {
            if (i==1 || i ==n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("x");
                }
                System.out.println();
                continue;
            }

            //stars for left side
            for (int j = 1; j <= stars; j++) {
                System.out.print("x");
            }
            //for middle space
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //stars for right side
            for (int j = 1; j <= stars; j++) {
                System.out.print("x");
            }

            System.out.println();
            if(i<=n/2){
                spaces += 2;
                stars--;
            } else {
                stars++;
                spaces -= 2;
            }
        }

        sc.close();
    }
}