import java.util.Scanner;

class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++) {
            if (i%2!=0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(num + "\t");
                    num++;
                }
            } else {
                num+=n-1;
                for (int j = 1; j <= n; j++) {
                    System.out.print(num + "\t");
                    num--;
                }
                num+=n+1;
            }
            System.out.println();
        }

        sc.close();
    }
}