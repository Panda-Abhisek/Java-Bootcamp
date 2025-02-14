import java.util.Scanner;

class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int spaces = 0, stars = num+4;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("x");
            }
            System.out.println();
            spaces++;
            stars -= 2;
            sc.close();
        }
    }
}