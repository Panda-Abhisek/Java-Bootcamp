import java.util.Scanner;

class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        //  
        
        for (int i = 1; i <= n; i++) {
            // Print left stars
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            // Print right stars
            for (int j = i; j <= n; j++) {
                if (j != 1) { // Avoid printing extra star in the first row
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}