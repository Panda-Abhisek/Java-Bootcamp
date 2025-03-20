import java.util.Scanner;

class LCMHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        int n=1; int m = 1;
        System.out.print("LCM of " + a + " and " + b + " is : ");
        while (true) {
            if (n%a==0 && n%b ==0) {
                System.out.println(n);
                break;
            }
            n++;
        }
        while (true) {
            if (a%m == 0 && b%m==0) {
                System.out.print(m);
                break;
            }
            m++;
        }
        System.out.print(" is the HCF of " + a + " and " + b);
        sc.close();
    }
}