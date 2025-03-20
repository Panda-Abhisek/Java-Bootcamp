import java.util.Scanner;

class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++) {
            if (i%2!=0) {
                num+=i-1;
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + "\t");
                    num++;
                }
            } else {
                num+=i-1;
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + "\t");
                    num--;
                }
                num++;

            }

            System.out.println();
        }

        sc.close();
    }
}