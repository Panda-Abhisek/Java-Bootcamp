import java.util.Scanner;

class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++) {
            if (i%2!=0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num = num+1;
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}