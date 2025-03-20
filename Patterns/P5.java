import java.util.Scanner;

class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i%2!=0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = n; j >= 1; j--) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }


        sc.close();
    }
}