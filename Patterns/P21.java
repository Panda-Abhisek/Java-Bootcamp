import java.util.Scanner;

class U {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //for space printing
            for (int j = 1; j <= i; j++) {
                if (j==1 || i==n || j==i ) {
                    System.out.print("x");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}