import java.util.Scanner;

class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        int spaces = num - 1, stars = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("x");
            }
            System.out.println();
            spaces--;
            stars++;
        }
        // System.out.println("Spaces after 1st for loop: "+spaces);
        // System.out.println("Stars after 1st for loop: "+stars);
        spaces=1; stars = num;
        for (int i = num - 1; i >= 1; i--) {
            // System.out.println("spaces in 2nd for loop: "+spaces);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars - 1; j++) {
                System.out.print("x");
            }
            System.out.println();
            spaces++;
            stars--;
        }
        sc.close();
    }
}