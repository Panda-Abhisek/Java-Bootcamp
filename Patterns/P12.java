import java.util.Scanner;

class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            // printing char
            for (int j = 1; j <= n; j++) {
                if (i == j)
                    System.out.print(ch);
                else
                    System.out.print(j);
            }
            ch++;

            System.out.println();
        }

        sc.close();
    }
}